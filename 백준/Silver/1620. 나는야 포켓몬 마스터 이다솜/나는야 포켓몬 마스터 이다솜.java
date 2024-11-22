import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String, Integer> stringMap = new HashMap<>();
        Map<Integer, String> integerMap = new HashMap<>();

        int mapSize = Integer.parseInt(st.nextToken());
        int answerSize = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= mapSize; i++) {
            String s = br.readLine();
            stringMap.put(s, i);
            integerMap.put(i, s);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (answerSize-- > 0) {
            String q = br.readLine();
            if (q.chars().allMatch(Character::isDigit)) {
                bw.write(integerMap.get(Integer.parseInt(q)) + "\n");
            } else {
                bw.write(stringMap.get(q) + "\n");
            }
        }
        bw.close();
    }
}
