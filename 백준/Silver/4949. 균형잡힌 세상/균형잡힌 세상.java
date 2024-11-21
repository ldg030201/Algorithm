import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = br.readLine();
            if (".".equals(str)) {
                break;
            }
            Stack<String> stack = new Stack<>();
            boolean isYes = true;
            for (char c : str.toCharArray()) {
                String s = String.valueOf(c);
                if ("(".equals(s) || "[".equals(s)) {
                    stack.add(s);
                } else if (")".equals(s)) {
                    if (stack.isEmpty() || !stack.pop().equals("(")) {
                        isYes = false;
                        break;
                    }
                } else if ("]".equals(s)) {
                    if (stack.isEmpty() || !stack.pop().equals("[")) {
                        isYes = false;
                        break;
                    }
                } else if (".".equals(s)) {
                    break;
                }
            }
            if (!stack.isEmpty()) isYes = false;
            bw.write(isYes ? "yes\n" : "no\n");
        }
        bw.close();
    }
}
