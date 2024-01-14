import java.io.*;
import java.util.*;
public class D4_5432 {
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            char[] line = sc.next().toCharArray();
            int cnt = 1; // 여는 괄호 개수
            int answer = 0; // 총 잘린 쇠막대기 
            for (int i=1; i<line.length; i++) {
                if (line[i] == ')') {
                    cnt = cnt - 1;
                    if (line[i-1] == '(') {
                        // 자르기
                        answer = answer + cnt;
                    } else {
                        answer = answer + 1;
                        
                    }
                } else {
                    cnt = cnt + 1;
                }
            }
            System.out.printf("#%d %d\n", tc, answer);
        }
        sc.close();
    }
}
