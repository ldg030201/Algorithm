import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n];
        while (n-- > 0) {
            coins[n] = Integer.parseInt(br.readLine());
        }

        int depth = 0;
        int count = 0;
        while (k > 0) {
            if (coins[depth] <= k) {
                k -= coins[depth];
                count++;
            } else {
                depth++;
            }
        }

        System.out.println(count);
    }
}
