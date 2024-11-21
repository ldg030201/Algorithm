import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (size-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    stack.push(st.nextToken());
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    }
                    bw.write(stack.pop() + "\n");
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    bw.write(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    }
                    bw.write(stack.peek() + "\n");
                    break;
            }
        }
        bw.close();
    }
}
