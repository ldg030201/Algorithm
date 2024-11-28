import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long p = Long.parseLong(st.nextToken());

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % p;
        }

        System.out.println(result);
    }
}