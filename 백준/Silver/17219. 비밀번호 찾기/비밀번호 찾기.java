import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> passwordMap = new HashMap<>();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            passwordMap.put(st.nextToken(), st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        while(m-- > 0) {
            sb.append(passwordMap.get(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }
}
