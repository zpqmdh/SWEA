import java.util.*;
import java.io.*;
public class D2_1940 {
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int N = sc.nextInt();
            int v = 0; // 속도
            int answer = 0;
            for (int i=0; i<N; i++) {
                int cmd = sc.nextInt();
                int a = 0;
                if (cmd == 0) {
                    answer = answer + v;
                } else if (cmd == 1) {
                    a = sc.nextInt();
                    v = v + a;
                    answer = answer + v;
                } else {
                    a = sc.nextInt();
                    if (v < a) {
                        v = 0;
                    } else {
                        v = v - a;
                    }
                    answer = answer + v;
                }
            }
            System.out.printf("#%d %d\n", tc, answer );
        }
    }
}
