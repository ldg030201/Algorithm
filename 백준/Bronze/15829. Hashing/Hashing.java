import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //값 버림
        int count = 0;
        BigDecimal sum = new BigDecimal(0);
        final BigDecimal to = new BigDecimal(31);
        for (char c : br.readLine().toCharArray()) {
            int charNum = (c - 'a') + 1;
            sum = sum.add(to.pow(count).multiply(new BigDecimal(charNum)));
            count++;
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum.remainder(BigDecimal.valueOf(1234567891))));
        bw.flush();
        bw.close();
    }
}