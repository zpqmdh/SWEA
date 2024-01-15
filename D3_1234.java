import java.io.*;
import java.util.*;

public class D3_1234 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int tc = 1; tc <= 10; tc++) {
            Stack<Character> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            String result = "";
            for(int i=0; i<N; i++) {
                char cur = str.charAt(i);
                if(stack.isEmpty() || cur != stack.peek()) {
                    stack.push(cur);
                } else {
                    stack.pop();
                }
            }
            while(!stack.isEmpty()) {
                result += stack.pop();
            }
            StringBuffer sb = new StringBuffer(result);
            System.out.printf("#%d %s\n", tc, sb.reverse().toString());

        }
    }
}