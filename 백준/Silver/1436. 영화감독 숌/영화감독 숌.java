import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = 665;
        int count = 0;
        while (true) {
            if (String.valueOf(a).contains("666")) {
                count++;
            }
            if (count >= n) break;
            a += 1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(a));
        bw.close();
    }
}