import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> xList = new ArrayList<>();
        List<String> yList = new ArrayList<>();

        int count = 3;
        while (count-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String x = st.nextToken();
            String y = st.nextToken();

            if (xList.contains(x)) {
                xList.remove(x);
            } else {
                xList.add(x);
            }
            if (yList.contains(y)) {
                yList.remove(y);
            } else {
                yList.add(y);
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(xList.get(0) + " " + yList.get(0));
        bw.flush();
        bw.close();
    }
}