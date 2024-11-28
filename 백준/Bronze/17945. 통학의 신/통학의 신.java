import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int x = -1000; x <= 1000; x++) {
            if ((x*x + 2*a*x + b) == 0) {
                sb.append(" ").append(x);
            }
        }

        String result = sb.toString();
        if (result.startsWith(" ")) {
            result = result.substring(1);
        }

        System.out.println(result);
    }
}