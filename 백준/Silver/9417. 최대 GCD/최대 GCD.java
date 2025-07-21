import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 수
        sc.nextLine();  // 개행 처리

        for (int t = 0; t < T; t++) {
            String[] input = sc.nextLine().split(" ");
            int[] nums = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                nums[i] = Integer.parseInt(input[i]);
            }

            int maxGCD = 0;

            // 모든 쌍 탐색
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int currentGCD = gcd(nums[i], nums[j]);
                    maxGCD = Math.max(maxGCD, currentGCD);
                }
            }

            System.out.println(maxGCD);
        }
    }
}
