import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        List<String> strList = new ArrayList<>();
        while (testCase-- > 0) {
            strList.add(br.readLine());
        }

        strList.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        List<String> duplicate = new ArrayList<>(); //중복방지

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String str : strList) {
            if (!duplicate.contains(str)) {
                bw.write(str + "\n");
                duplicate.add(str);
            }
        }

        bw.close();
    }
}