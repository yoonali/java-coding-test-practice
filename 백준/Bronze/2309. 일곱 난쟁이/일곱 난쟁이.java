import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int x = sc.nextInt();
            arr.add(x);
            sum += x;
        }

        int temp = sum - 100;

        int a = -1 ,b = -1;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == temp) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        arr.remove(b);
        arr.remove(a);


        Collections.sort(arr);
        for (int x : arr) {
            System.out.println(x);
        }
    }
}

