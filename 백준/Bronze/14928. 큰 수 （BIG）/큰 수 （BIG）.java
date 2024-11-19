import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String big = br.readLine();

        long r = 0;
        for(char c : big.toCharArray()) {
            r = (r * 10 + (c - '0')) % 20000303;
        }

        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(r));
        bw.flush();
        bw.close();
    }
}