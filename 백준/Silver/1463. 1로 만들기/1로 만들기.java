import java.io.*;

public class Main {
    static Integer[] CACHE = new Integer[1_000_001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        CACHE[1] = 0;
        CACHE[2] = 1;
        CACHE[3] = 1;
        System.out.println(fn(n));
    }

    public static Integer fn(int n) {
        if (CACHE[n] == null) {
            if (n % 6 == 0) {
                CACHE[n] =  Math.min(Math.min(fn(n / 3), fn(n / 2)), fn(n - 1)) + 1;
            } else if (n % 3 == 0) {
                CACHE[n] =  Math.min(fn(n / 3), fn(n - 1)) + 1;
            } else if (n % 2 == 0) {
                CACHE[n] =  Math.min(fn(n / 2), fn(n - 1)) + 1;
            } else {
                CACHE[n] = fn(n - 1) + 1;
            }
        }

        return CACHE[n];
    }
}
