import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        Deque<String> queue = new LinkedList<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (size-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push":
                    queue.add(st.nextToken());
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    }
                    bw.write(queue.poll() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    }
                    bw.write(queue.getFirst() + "\n");
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                        break;
                    }
                    bw.write(queue.getLast() + "\n");
                    break;
            }
        }
        bw.close();
    }
}
