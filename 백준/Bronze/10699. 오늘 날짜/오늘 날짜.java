import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        LocalDate today = LocalDate.now();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(today.toString());
        bw.flush();
        bw.close();
    }
}