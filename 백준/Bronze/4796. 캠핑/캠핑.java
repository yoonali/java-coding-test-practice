import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 1;

        while(true) {
            String line = br.readLine();
            if(line == null) break;

            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            int result = (c/b) * a + Math.min(c%b, a);

            System.out.println("Case " + i + ": " + result);
            i++;
        }


    }
}