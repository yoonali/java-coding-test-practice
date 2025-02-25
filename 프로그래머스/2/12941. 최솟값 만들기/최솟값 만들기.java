import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        // A는 오름차순 정렬 (작은 수부터)
        Arrays.sort(A);

        // B는 내림차순 정렬 (큰 수부터)
        Arrays.sort(B);
        int len = B.length;
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[len - 1 - i]; // A의 작은 값 * B의 큰 값
        }

        return answer;
    }
}
