import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //값 버림

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Double> doubleList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            doubleList.add(Double.parseDouble(st.nextToken()));
        }
        doubleList.sort(Collections.reverseOrder());

        double max = doubleList.get(0);
        double sum = 0;
        for (double d : doubleList) {
            sum += d / max * 100;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum/doubleList.size()));
        bw.flush();
        bw.close();
    }
}