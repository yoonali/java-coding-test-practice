import java.util.*;
import java.io.*;
import java.math.*;

public class Main{

    static long modPow(long a, long b, long mod) {
        long r = 1 % mod;
        a %= mod;

        while (b > 0) {
            if ((b & 1) == 1) r = (r * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return r;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(modPow(A, B, C));

//             // long result = (long) (Math.pow(A, B) / C);

// //          추가로, Math.pow(A,B)는 double이라 큰 수에서 부정확할 수 있어요.
// //          정확한 정수 계산이 필요하면 BigInteger 또는 정수 거듭제곱(빠른 제곱)로 바꾸는 게 안전합니다.

//             BigInteger result = BigInteger.valueOf(A)
//                 .pow(B)
//                 .divide(BigInteger.valueOf(C));
            
//             System.out.printf("%d", result);
    }
}