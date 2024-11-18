import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long c = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        StringTokenizer value = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(value.hasMoreTokens()) {
            String v = value.nextToken();
            if (Long.parseLong(v) < max) {
                bw.write(v + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}