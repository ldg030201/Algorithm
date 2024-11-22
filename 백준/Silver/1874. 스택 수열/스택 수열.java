import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int size = Integer.parseInt(br.readLine());

       int lastCount = 0;

       //BufferedWriter를 쓰면 오류를 내보낸다고 해서 sb로 바꿔서 시도
       StringBuilder sb = new StringBuilder();
       Stack<Integer> stack = new Stack<>();
       while (size-- > 0) {
           int n = Integer.parseInt(br.readLine());
           if (lastCount < n) {
               for (int i = lastCount + 1; i <= n; i++) {
                   stack.push(i);
                   sb.append("+\n");
               }

               lastCount = n;
           } else if (stack.peek() != n) {
               System.out.println("NO");
               return;
           }

           stack.pop();
           sb.append("-\n");
       }

        System.out.println(sb);
    }
}
