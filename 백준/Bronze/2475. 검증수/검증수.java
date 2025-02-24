import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int sum = 0;

        String[] strNum = s.split(" ");

        int[] arr = new int[strNum.length];

        for (int i = 0; i < strNum.length; i++) {
            arr[i] = Integer.parseInt(strNum[i]);
        }

        for(int num : arr) {
            sum = sum + (int) Math.pow(num, 2);
        }

        int result = (int) sum % 10;
        System.out.println(result);
    }
}