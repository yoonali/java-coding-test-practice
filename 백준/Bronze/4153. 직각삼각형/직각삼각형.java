import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static boolean isRightTriangle(int A, int B, int C) {
        int max = Math.max(A, Math.max(B, C));

        int sumOfSquares = A * A + B * B + C * C - max * max; // 나머지 두 변의 제곱 합

        // 피타고라스의 정리 확인
        return sumOfSquares == max * max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> al = new ArrayList<>();
        String line;

        while (!(line = br.readLine()).equals("0 0 0")) {
            al.add(line);
        }

        for (int i = 0; i < al.size(); i++) {
            StringTokenizer st = new StringTokenizer(al.get(i));
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (isRightTriangle(A, B, C)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}