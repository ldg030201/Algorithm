import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        while (count-- > 0) {
            set.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> list = new ArrayList<>(set);
        list.sort(Integer::compareTo);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : list) {
            bw.write(i + "\n");
        }

        bw.close();
    }
}