import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((a % 4 == 0 && a % 100 != 0) || a % 400 == 0 ? "1" : "0");
        bw.flush();
        bw.close();
    }
}