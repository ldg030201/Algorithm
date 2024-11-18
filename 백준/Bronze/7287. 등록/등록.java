import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("43\n");
        bw.write("ldg8910");
        bw.flush();
        bw.close();
    }
}