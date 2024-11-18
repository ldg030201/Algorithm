import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        long max = 0;
        int maxCount = 0;
        int count = 0;
        while ((str = br.readLine()) != null && !str.isEmpty()) {
            count++;
            long n = Long.parseLong(str);
            if (n > max) {
                maxCount = count;
                max = n;
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(max + "\n");
        bw.write(String.valueOf(maxCount));
        bw.flush();
        bw.close();
    }
}