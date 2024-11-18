import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long totalCount = Long.parseLong(br.readLine());

        StringTokenizer tSize = new StringTokenizer(br.readLine(), " ");
        StringTokenizer tp = new StringTokenizer(br.readLine(), " ");

        long t = Long.parseLong(tp.nextToken());
        long p = Long.parseLong(tp.nextToken());

        br.close();

        //티셔츠 카운트
        long tCount = 0;
        while (tSize.hasMoreTokens()) {
            long sizeCount = Long.parseLong(tSize.nextToken());
            tCount += sizeCount / t;
            if (sizeCount % t > 0) {
                tCount++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(tCount + "\n");
        bw.write(totalCount / p + " " + totalCount % p);
        bw.flush();
        bw.close();
    }
}