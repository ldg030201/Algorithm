import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] stand = {1, 1, 2, 2, 2, 8};
        int count = 0;

        StringBuffer sb = new StringBuffer();
        while (st.hasMoreTokens()) {
            sb.append(stand[count++] - Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.println(sb);
    }
}