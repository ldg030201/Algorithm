import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        str = str.replaceAll("B", "v")
                .replaceAll("E", "ye")
                .replaceAll("H", "n")
                .replaceAll("P", "r")
                .replaceAll("C", "s")
                .replaceAll("Y", "u")
                .replaceAll("X", "h");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str.toLowerCase());
        bw.flush();
        bw.close();
    }
}