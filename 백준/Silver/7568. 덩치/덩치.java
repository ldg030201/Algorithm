import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArr = new String[Integer.parseInt(br.readLine())];

        int count = 0;
        while (count < stringArr.length) {
            stringArr[count++] = br.readLine();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String s : stringArr) {
            int rating = 1;
            for (String s2 : stringArr) {
                StringTokenizer st1 = new StringTokenizer(s, " ");
                StringTokenizer st2 = new StringTokenizer(s2, " ");
                int w1 = Integer.parseInt(st1.nextToken());
                int h1 = Integer.parseInt(st1.nextToken());

                int w2 = Integer.parseInt(st2.nextToken());
                int h2 = Integer.parseInt(st2.nextToken());

                if (w1 < w2 && h1 < h2) {
                    rating++;
                }
            }
            bw.write(rating + " ");
        }
        bw.close();
    }
}