import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long testCount = Long.parseLong(br.readLine());
        while (testCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor;
            int ho;

            if ((n % h) == 0) {
                floor = h * 100;
                ho = n / h;
            } else {
                floor = (n % h) * 100;
                ho = (n / h) + 1;
            }

            bw.write((floor + ho) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}