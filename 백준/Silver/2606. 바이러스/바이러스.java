import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computerCount = Integer.parseInt(br.readLine());
        int lineCount = Integer.parseInt(br.readLine());

        map = new boolean[computerCount + 1][computerCount + 1];
        visited = new boolean[computerCount + 1];

        while (lineCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            map[n1][n2] = true;
            map[n2][n1] = true;
        }

        System.out.println(fnBfs(1));
    }

    private static int fnBfs(int startId) {
        int resultCount = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startId);
        visited[startId] = true;

        while (!queue.isEmpty()) {
            int q = queue.poll();
            for (int i = 1; i <= map[q].length - 1; i++) {
                if (!visited[i] && map[q][i]) {
                    visited[i] = true;
                    queue.add(i);
                    resultCount++;
                }
            }
        }

        return resultCount;
    }
}
