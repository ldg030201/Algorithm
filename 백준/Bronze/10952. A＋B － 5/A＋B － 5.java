import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long n1 = Long.parseLong(st.nextToken());
            long n2 = Long.parseLong(st.nextToken());
            
            if (n1 == 0 && n2 == 0) {
                break;
            }

            bw.write(n1 + n2 + "\n");
        }

        bw.flush();
        bw.close();
    }
}