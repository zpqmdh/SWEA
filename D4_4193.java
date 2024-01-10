import java.util.*;

class D4_4193
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N;
            int answer = -1;
            N = sc.nextInt();
            int[][] board = new int[N][N];
            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    board[i][j] = sc.nextInt();
                }
            }
            int[] start = new int[2];
            int[] end = new int[2];
            for (int i=0; i<2; i++) start[i] = sc.nextInt();
            for (int i=0; i<2; i++) end[i] = sc.nextInt();
            int[] dy = {-1, 1, 0, 0};
			int[] dx = {0, 0, 1, -1};
			Deque<int[]> Q = new ArrayDeque<>();
			Q.add(new int[] {start[0], start[1], 0});
			boolean[][] visited = new boolean[N][N];
            for (int i=0; i<N; i++) 
                Arrays.fill(visited[i], false);
            while (!Q.isEmpty()) {
                int y = Q.peek()[0];
                int x = Q.peek()[1];
                int time = Q.peek()[2];
                Q.poll();
                visited[y][x] = true;
             
                if (y == end[0] && x == end[1]) {
                    if (answer != -1) answer = Math.min(answer, time);
                    else answer = time;
                    continue;
                }
                for (int a=0; a<4; a++) {
                    int ny = y + dy[a];
                    int nx = x + dx[a];
                    if (0<=ny && 0<=nx && ny<N && nx<N && !visited[ny][nx]) {
                        if (board[ny][nx] == 0) Q.add(new int[] {ny, nx, time+1});
                        else if (board[ny][nx] == 2) {
                            if (time != 0 && time % 3 == 2) Q.add(new int[] {ny, nx, time+1});
                            else Q.add(new int[] {y, x, time+1});
                    	}
                    }            
				}
            }
           System.out.println("#" + test_case + " " + answer);
        }
        sc.close();
    }
}