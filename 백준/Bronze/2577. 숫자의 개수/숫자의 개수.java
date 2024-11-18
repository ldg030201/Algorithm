import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());

        br.close();

        long n = a * b * c;

        long[] longArr = new long[10];
        for(char cha : String.valueOf(n).toCharArray()) {
            longArr[Integer.parseInt(String.valueOf(cha))]++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (long l : longArr) {
            bw.write(l + "\n");
        }
        bw.flush();
        bw.close();
    }
}