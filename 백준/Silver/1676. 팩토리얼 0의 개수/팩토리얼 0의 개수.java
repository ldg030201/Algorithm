import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[] charArr = String.valueOf(fact(BigInteger.valueOf(n))).toCharArray();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        int minusLength = 0;
        while (charArr[charArr.length - 1 - minusLength++] == '0') {
            count++;
        }

        bw.write(String.valueOf(count));
        bw.close();
    }

    public static BigInteger fact(BigInteger n) {
        if (n.equals(BigInteger.valueOf(0))) return BigInteger.valueOf(1);
        return n.multiply(fact(n.subtract(BigInteger.valueOf(1))));
    }
}