import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long testCount = Long.parseLong(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (testCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long l = Long.parseLong(st.nextToken());
            String s = st.nextToken();

            for (char c : s.toCharArray()) {
                for (int i = 0; i < l; i++) {
                    bw.write(String.valueOf(c));
                }
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}