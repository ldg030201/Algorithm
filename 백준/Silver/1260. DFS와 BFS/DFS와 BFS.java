import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static boolean[][] map;
    static boolean[] visited;
    static StringBuilder root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        map = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];

        //간선 연결
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            map[n1][n2] = map[n2][n1] = true;
        }

        root = new StringBuilder();

        //DFS
        fnDfs(v);

        //줄바꿈 및 초기화 작업
        root.append("\n");
        visited = new boolean[n + 1];

        //BFS
        fnBfs(v);

        if (root.toString().startsWith(" ")) root.delete(0, 1);
        System.out.println(root);
    }

    private static void fnDfs(int id) {
        visited[id] = true;
        root.append(" ").append(id);

        for (int i = 1; i <= map[id].length - 1; i++) {
            if (map[id][i] && !visited[i]) {
                fnDfs(i);
            }
        }
    }

    private static void fnBfs(int startId) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startId] = true;
        queue.add(startId);
        root.append(startId);

        while (!queue.isEmpty()) {
            int q = queue.poll();
            for (int i = 1; i <= map[q].length - 1; i++) {
                if (map[q][i] && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                    root.append(" ").append(i);
                }
            }
        }
    }
}