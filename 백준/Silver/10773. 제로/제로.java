import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        while (count-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.close();
    }
}
