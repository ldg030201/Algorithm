import java.io.*;

public class Main {
    static Integer[][] CACHE = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        CACHE[0][0] = 1;
        CACHE[0][1] = 0;
        CACHE[1][0] = 0;
        CACHE[1][1] = 1;

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            fn(n);
            sb.append(CACHE[n][0]).append(" ").append(CACHE[n][1]).append("\n");
        }
        System.out.println(sb);
    }

    public static Integer[] fn(int n) {
        if (CACHE[n][0] == null || CACHE[n][1] == null) {
            CACHE[n][0] = fn(n - 1)[0] + fn(n - 2)[0];
            CACHE[n][1] = fn(n - 1)[1] + fn(n - 2)[1];
        }

        return CACHE[n];
    }
}
