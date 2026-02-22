import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) dq.addLast(i);

        st = new StringTokenizer(br.readLine());
        int answer = 0;

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            // target의 현재 index 찾기 (0-based)
            int idx = 0;
            for (int x : dq) {
                if (x == target) break;
                idx++;
            }

            int size = dq.size();
            int left = idx;
            int right = size - idx;

            // 더 적은 회전 방향으로 이동
            if (left <= right) {
                for (int k = 0; k < left; k++) {
                    dq.addLast(dq.pollFirst());   // 왼쪽 회전
                }
                answer += left;
            } else {
                for (int k = 0; k < right; k++) {
                    dq.addFirst(dq.pollLast());   // 오른쪽 회전
                }
                answer += right;
            }

            // 맨 앞 원소 제거 (target)
            dq.pollFirst();
        }

        System.out.println(answer);
    }
}