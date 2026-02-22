import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String line = br.readLine();   // "4 7"
        // StringTokenizer st = new StringTokenizer(line);
        
        // int N = Integer.parseInt(st.nextToken());
        // int M = Integer.parseInt(st.nextToken());

        // int[] arr = new int[N];
        // int sum = 0;
        // int result = 0;

        // String line2 = br.readLine();   // "20 15 10 17"
        // StringTokenizer st2 = new StringTokenizer(line2);

        // for (int i = 0; i < N; i++) {
        //     int value = Integer.parseInt(st2.nextToken());
        //     arr[i] = value;
        //     sum += value;
        // }

        // int mid = sum / N;

        // while(true) {
        //     if(result >= M) {
        //         for(int i = 0; i <= arr.length; i++) {
        //             if(arr[i] - mid >= 0) {
        //                 int value = arr[i] - mid;
        //                 result += value;
        //             }
        //         }
        //         break;
        //     } else {
        //         mid--;
        //     }
            
        // }
        
        // System.out.println(mid);


        // 1) N, M 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2) 나무 높이 입력 + 최대값 찾기
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        int max = 0;
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            arr[i] = value;
            if (value > max) max = value;
        }

        // 3) 이분탐색: H(절단 높이)의 최댓값 찾기
        int left = 0;
        int right = max;

        while (left <= right) {
            int mid = left + (right - left) / 2; // overflow 방지
            long result = 0;

            // mid 높이로 잘랐을 때 얻는 나무 길이 합
            for (int i = 0; i < N; i++) {
                if (arr[i] > mid) result += (arr[i] - mid);
            }

            // 4) M과 비교해서 범위 조정
            if (result >= M) {
                // 충분히 얻음 → 더 높게 잘라도 되는지(=mid 더 키우기)
                left = mid + 1;
            } else {
                // 부족함 → 더 낮게 잘라야 함(=mid 더 낮추기)
                right = mid - 1;
            }
        }

        // 반복 종료 후 right가 "가능했던 절단 높이의 최댓값"
        System.out.println(right);
    }
        
}