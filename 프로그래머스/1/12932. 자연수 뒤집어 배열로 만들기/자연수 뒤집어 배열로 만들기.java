import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();

        if (n == 0) {          // ✅ 0 예외 처리
            list.add(0);
        }

        while (n > 0) {
            list.add((int)(n % 10));
            n /= 10;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
