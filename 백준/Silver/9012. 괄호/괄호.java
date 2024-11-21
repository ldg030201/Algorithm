import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        while (count-- > 0) {
            Stack<Character> stack = new Stack<>();
            boolean isYes = true;
            for (char c : br.readLine().toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || !stack.pop().equals('(')) {
                        isYes = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                isYes = false;
            }
            bw.write(isYes ? "YES\n" : "NO\n");
        }
        bw.close();
    }
}
