import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        long n = 0;
        while (st.hasMoreTokens()) {
            long a = Long.parseLong(st.nextToken());
            n += a * a;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(n % 10));
        bw.flush();
        bw.close();
    }
}