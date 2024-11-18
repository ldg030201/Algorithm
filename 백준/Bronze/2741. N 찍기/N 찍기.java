import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= a; i++) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}