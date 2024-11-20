import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.close();
    }
}