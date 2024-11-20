import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken()); //낮에 올라가는 높이
        long b = Long.parseLong(st.nextToken()); //밤에 떨어지는 높이
        long v = Long.parseLong(st.nextToken()); //총 높이

        long dayCount = (v - b) / (a - b); //도착하면 떨어지지 않는 다는 조건 때문에 v - b

        //대신 하루 더 소용되는지 체크
        if ((v - b) % (a - b) != 0) {
            dayCount++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dayCount));
        bw.close();
    }
}