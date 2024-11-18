import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long unused = Long.parseLong(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Long> longList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            longList.add(Long.parseLong(st.nextToken()));
        }

        long n = Long.parseLong(br.readLine());
        int count = 0;
        for (long a : longList) {
            if (a == n) {
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}