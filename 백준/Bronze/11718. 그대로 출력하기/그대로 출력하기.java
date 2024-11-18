import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while ((s = br.readLine()) != null) {
            bw.write(s + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}