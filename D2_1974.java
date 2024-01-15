import java.util.*;
public class D2_1974 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
            int[][] map = new int[9][9];
            for (int i=0; i<9; i++) {
                for (int j=0; j<9; j++) {
                    map[i][j] =sc.nextInt();
                }
            }
            int answer = 1;

            // 가로, 세로 확인
            for (int i=0; i<9; i++) {
                int[] count = new int[10];
                Arrays.fill(count, 0);
                for (int j=0; j<9; j++) {
                    count[map[i][j]]++;
                    count[map[j][i]]++;
                }
                for (int j=1; j<10; j++) {
                    if (count[j] != 2) {
                        answer = 0;
                    }
                }
            }
            for (int i=0; i<9; i=i+3) {
                for (int j=0; j<9; j=j+3) {
                    int[] count = new int[10];
                    for (int k=i; k<i+3; k++) {
                        for (int l=j; l<j+3; l++) {
                            count[map[k][l]]++;
                        }
                    }
                    for (int k=1; k<10; k++) {
                        if (count[k] != 1) {
                            answer = 0;
                        }
                    }
                }
            }
            System.out.printf("#%d %d\n", tc, answer);
        }
        sc.close();
    }
    
}
