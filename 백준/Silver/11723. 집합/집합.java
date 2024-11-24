import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int whileCount = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int s = 0;
        while (whileCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int x = 0;
            if (!"all".equals(str) && !"empty".equals(str)) {
                x = Integer.parseInt(st.nextToken());
            }
            switch (str) {
                case "add":
                    s |= (1 << x);
                    break;
                case "remove":
                    s &= ~(1 << x);
                    break;
                case "check":
                    sb.append((s & (1 << x)) != 0 ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    s ^= (1 << x);
                    break;
                case "all":
                    s = (1 << 21) - 1;
                    break;
                case "empty":
                    s = 0;
                    break;
            }
        }
        System.out.println(sb);
    }
}