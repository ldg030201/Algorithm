import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        while (n-- > 0) {
            set.add(br.readLine());
        }

        List<String> resultList = new ArrayList<>();
        while (m-- > 0) {
            String str = br.readLine();
            if (set.contains(str)) {
                resultList.add(str);
            }
        }

        resultList.sort(String::compareTo);
        System.out.println(resultList.size());
        for (String result : resultList) {
            System.out.println(result);
        }
    }
}
