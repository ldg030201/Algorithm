import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //값버리기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        br.close();
        
        long count = 0;
        while (st.hasMoreTokens()) {
            if (isSoSu(Long.parseLong(st.nextToken()))) {
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    //소수 구하는 함수
    static private boolean isSoSu(long l) {
        if (l <= 1) return false;
        if (l == 2) return true;

        for (int i = 2; i < l; i++) {
            if (l % i == 0) return false;
        }

        return true;
    }
}