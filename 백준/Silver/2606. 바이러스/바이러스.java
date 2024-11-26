import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] map;
    static boolean[] visited;
    static int resultCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computerCount = Integer.parseInt(br.readLine());
        int lineCount = Integer.parseInt(br.readLine());

        map = new boolean[computerCount + 1][computerCount + 1];
        visited = new boolean[computerCount + 1];
        resultCount = 0;

        while (lineCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            map[n1][n2] = true;
            map[n2][n1] = true;
        }
        fnDfs(1);
        System.out.println(resultCount - 1);
    }

    private static void fnDfs(int id) {
        visited[id] = true;
        resultCount++;

        for (int i = 1; i <= map[id].length - 1; i++) {
            if (!visited[i] && map[id][i]) {
                fnDfs(i);
            }
        }
    }
}
