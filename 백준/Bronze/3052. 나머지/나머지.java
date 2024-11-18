import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Long> longSet = new HashSet<Long>();
        int count = 10;
        while (count-- > 0) {
            longSet.add(Long.parseLong(br.readLine()) % 42);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(longSet.size()));
        bw.flush();
        bw.close();
    }
}