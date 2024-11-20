import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();

        long c = 0;
        long g = 1;
        while(g < n) {
            g = g + (6 * c);
            c++;
        }
        if (c == 0) c = 1;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(c));
        bw.flush();
        bw.close();
    }
}