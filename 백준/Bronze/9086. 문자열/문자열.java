import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            bw.write(s.charAt(0) + "" + s.charAt(s.length() - 1) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}