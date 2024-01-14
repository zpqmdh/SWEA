import java.util.*;
import java.io.*;
public class D3_1289 {
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            char flag = '0';
            int answer = 0;
            char[] line = sc.next().toCharArray();
            for (int i=0; i<line.length; i++) {
                if (flag != line[i]) {
                    answer++;
                    flag = line[i];
                }
            }
            System.out.printf("#%d %d\n", tc, answer);
        }
    }
}
