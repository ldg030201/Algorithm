import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = Integer.MIN_VALUE;
        while (n > 0) {
            int lemon = Integer.parseInt(st.nextToken());
            max = Math.max(max, lemon - n);

            n--;
        }
        System.out.println(max);
    }
}