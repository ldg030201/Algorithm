import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cut = (int) (Math.round(n * 0.15)); //위아래 삭제 기준

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(Integer::compareTo);
        double result = 0;
        for (int i = cut; i < n - cut; i++) {
            result += list.get(i);
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Math.round(result / (n - cut - cut))));
        bw.close();
    }
}
