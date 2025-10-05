import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        int range = 1;

        while(range < n) {
            if(n == 1) {
                System.out.print(1);
            }
            range = range + (6 * count);
            count++;
        }

        System.out.println(count);
    }
}
