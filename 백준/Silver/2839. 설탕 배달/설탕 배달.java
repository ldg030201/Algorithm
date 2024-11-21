import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                break;
            }
            if (n < 3) {
                count = -1;
                break;
            }
            n -= 3;
            count++;
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}
