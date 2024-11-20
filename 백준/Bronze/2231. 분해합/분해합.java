import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        br.close();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getGen(m));
        bw.flush();
        bw.close();
    }

    private static String getGen(int m) {
        int n = 0;
        while (n++ < m) {
            String str = String.valueOf(n);
            int sum = 0;
            for (char c : str.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }

            if ((n + sum) == m) {
                return String.valueOf(n);
            }
        }

        return "0";
    }
}