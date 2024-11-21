import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            set.add(st.nextToken());
        }

        br.readLine();
        st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (st.hasMoreTokens()) {
            if (set.contains(st.nextToken())) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.close();
    }
}