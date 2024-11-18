import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder r = new StringBuilder();
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            if (Character.isUpperCase(c)) {
                r.append(Character.toLowerCase(c));
            } else {
                r.append(Character.toUpperCase(c));
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(r.toString());
        bw.flush();
        bw.close();
    }
}