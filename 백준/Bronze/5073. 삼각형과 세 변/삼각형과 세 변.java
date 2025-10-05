import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == 0 && b == 0 && c == 0) {
                break;
            }else{
                System.out.println(tr(a,b,c));
            }
        }
        sc.close();
    }

    public static String tr (int a, int b, int c) {
        int[] arr= {a,b,c};
        Arrays.sort(arr);

        a = arr[0];
        b = arr[1];
        c = arr[2];

        if(c >= a + b){
            return "Invalid";
        }

        if(a == b && b == c) {
            return "Equilateral";
        }else if(a == b || b == c || a == c) {
            return "Isosceles";
        }else {
            return "Scalene";
        }

    }
}
