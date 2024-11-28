import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorial(1, n));
    }

    private static BigInteger factorial(int start, int n) {
        BigInteger num = BigInteger.valueOf(start);

        if (start < n) {
            int mid = (start + n) / 2;
            num = factorial(start, mid).multiply(factorial(mid + 1, n));
        }

        return num;
    }
}