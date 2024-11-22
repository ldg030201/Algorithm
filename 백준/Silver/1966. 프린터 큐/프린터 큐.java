import java.io.*;
import java.util.*;

class File {
    int importance; //중요도
    int index; //index 번호

    File(int importance, int index) {
        this.importance = importance;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int whileCount = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (whileCount-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int fileCount = Integer.parseInt(st.nextToken());
            int fileIndex = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            Queue<File> queue = new LinkedList<>();
            for (int i = 0; i < fileCount; i++) {
                queue.add(new File(Integer.parseInt(st.nextToken()), i));
            }

            int count = 0;
            while (!queue.isEmpty()) {
                File file = queue.poll();
                boolean isBiggest = true;
                for (File f : queue) {
                    if (f.importance > file.importance) {
                        isBiggest = false;
                        break;
                    }
                }
                if (isBiggest) {
                    count++;
                    if (file.index == fileIndex) {
                        bw.write(count + "\n");
                        break;
                    }
                } else {
                    queue.add(file);
                }
            }
        }
        bw.close();
    }
}
