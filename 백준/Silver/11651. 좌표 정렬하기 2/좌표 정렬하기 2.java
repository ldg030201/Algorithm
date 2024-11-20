import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Dot {
    int x;
    int y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int i = 0;
        List<Dot> dotList = new ArrayList<>();
        while (i < count) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dotList.add(new Dot(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            i++;
        }

        dotList.sort((o1, o2) -> {
            if (o1.y == o2.y) {
                return o1.x - o2.x;
            } else {
                return o1.y - o2.y;
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Dot dot : dotList) {
            bw.write(dot.x + " " + dot.y + "\n");
        }
        bw.close();
    }
}