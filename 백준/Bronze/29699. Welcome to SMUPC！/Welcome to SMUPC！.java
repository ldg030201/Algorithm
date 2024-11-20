import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();

        final String text = "WelcomeToSMUPC";

        int index;
        if (a % 14 == 0) {
            index = 13;
        } else {
             index = a % 14 - 1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(text.charAt(index));
        bw.flush();
        bw.close();
    }
}