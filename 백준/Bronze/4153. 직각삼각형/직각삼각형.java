import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            List<Long> longList = new ArrayList<>();
            longList.add(a);
            longList.add(b);
            longList.add(c);
            longList.sort(Long::compareTo);

            if (Math.pow(longList.get(0), 2) + Math.pow(longList.get(1), 2) == Math.pow(longList.get(2), 2)) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}