import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getGcd(Math.max(a, b), Math.min(a, b)) + "\n");
        bw.write(getLcd(Math.max(a, b), Math.min(a, b)) + "");
        bw.flush();
        bw.close();
    }

    //최대공약수
    private static int getGcd(int a, int b) {
        return (b == 0) ? a : getGcd(b, a % b);
    }

    //최대공배수
    private static int getLcd(int a, int b) {
        return a * b / getGcd(a, b);
    }
}