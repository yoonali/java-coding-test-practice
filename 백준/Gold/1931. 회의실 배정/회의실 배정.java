import java.util.*;
import java.io.*;

class Pair {
    int a; 
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " " + b;
    }
}

// 백준 1931: 회의실 배정
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new Pair(a, b));
        }

        list.sort((o1, o2) -> {
            if (o1.b == o2.b) return o1.a - o2.a; // 종료시간 같으면 시작시간 작은 순
            return o1.b - o2.b;                  // 종료시간 작은 순
        });
        
        int result = 0;
        int endTime = 0;

        for (Pair p : list) {
            if (p.a >= endTime) {   // 시작시간이 이전 종료시간 이상이면 선택
                result++;
                endTime = p.b;
            }
        }

        System.out.println(result);
    }
}