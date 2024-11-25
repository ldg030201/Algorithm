import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> intList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            intList.add(Integer.parseInt(st.nextToken()));
        }
        intList.sort(Integer::compareTo);

        int result = 0;
        int waitMin = 0;
        for (int i : intList) {
            result += (i + waitMin);
            waitMin += i;
        }

        System.out.println(result);
    }
}
