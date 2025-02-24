import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();  

        System.out.println(A + B); // 덧셈
        System.out.println(A - B); // 뺄셈
        System.out.println(A * B); // 곱셈
        System.out.println(A / B); // 나눗셈 (정수 나눗셈)
        System.out.println(A % B); // 나머지
    }
}
