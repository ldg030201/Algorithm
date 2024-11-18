import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long[][] longArr = new long[(int) a][(int) b];
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < b; j++) {
                longArr[i][j] = Long.parseLong(st.nextToken());
            }
        }

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < b; j++) {
                longArr[i][j] += Long.parseLong(st.nextToken());
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                bw.write(longArr[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}