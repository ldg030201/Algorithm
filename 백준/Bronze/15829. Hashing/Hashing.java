import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //값 버림
        int count = 0;
        int sum = 0;
        for (char c : br.readLine().toCharArray()) {
            int charNum = (c - 'a') + 1;
            sum += (int) (charNum * Math.pow(31, count));
            count++;
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}