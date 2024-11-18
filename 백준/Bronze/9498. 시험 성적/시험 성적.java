import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (a >= 90) {
            bw.write("A");
        } else if (a >= 80) {
            bw.write("B");
        } else if (a >= 70) {
            bw.write("C");
        } else if (a >= 60) {
            bw.write("D");
        } else {
            bw.write("F");
        }
        bw.flush();
        bw.close();
    }
}