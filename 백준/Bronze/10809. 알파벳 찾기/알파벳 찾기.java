import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] engArr = new int[26];

        String s = br.readLine();
        for (int i = 0; i < engArr.length; i++) {
            engArr[i] = s.indexOf(i + 'a');
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : engArr) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}