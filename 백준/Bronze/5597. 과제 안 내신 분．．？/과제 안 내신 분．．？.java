import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Long> longList = new ArrayList<>();
        for (long i = 1; i <= 30; i++) {
            longList.add(i);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (long i = 1; i <= 28; i++) {
            longList.remove(Long.parseLong(br.readLine()));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (long n : longList) {
            bw.write(n + "\n");
        }
        bw.flush();
        bw.close();
    }
}