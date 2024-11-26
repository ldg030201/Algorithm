import java.io.*;

class Main {
    static int[] CACHE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        CACHE = new int[11];

        CACHE[1] = 1;
        CACHE[2] = 2;
        CACHE[3] = 4;

        for (int i = 4; i <= 10; i++) {
            CACHE[i] = CACHE[i - 3] + CACHE[i - 2] + CACHE[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(CACHE[n]).append("\n");
        }
        System.out.println(sb);
    }
}