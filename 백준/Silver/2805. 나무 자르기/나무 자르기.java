import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 나무 수
        int m = Integer.parseInt(st.nextToken());  // 필요한 나무 길이

        int[] arr = new int[n];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }

        int low = 0;
        int high = max;
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long total = 0;

            for (int height : arr) {
                if (height > mid) {
                    total += (height - mid);
                    if (total >= m) break;  // 조기 종료로 미세 최적화
                }
            }

            if (total >= m) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(result);
    }
}
