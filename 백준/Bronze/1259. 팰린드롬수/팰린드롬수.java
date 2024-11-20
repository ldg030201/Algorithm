import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while (true) {
            str = br.readLine();
            if (str.equals("0")) {
                break;
            }

            char[] charArr = str.toCharArray();
            boolean flag = true;
            for (int i = 0; i < charArr.length / 2; i++) {
                if (charArr[i] != charArr[charArr.length - 1 - i]) {
                    flag = false;
                }
            }
            bw.write(flag ? "yes\n" : "no\n");
        }
        bw.flush();
        bw.close();
    }
}