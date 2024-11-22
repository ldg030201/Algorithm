import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < size; i++) {
            int a = Integer.parseInt(br.readLine());
            total += a;
            list.add(a);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //평균
        bw.write(Math.round((float) total / size) + "\n");

        Collections.sort(list);
        //중앙값
        bw.write(list.get(size / 2) + "\n");

        //최빈값
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int maxMany = Collections.max(map.values());
        //최빈값 정렬 list
        List<Integer> manyList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxMany) {
                manyList.add(entry.getKey());
            }
        }

        Collections.sort(manyList);
        if (manyList.size() > 1) {
            bw.write(manyList.get(1) + "\n");
        } else {
            bw.write(manyList.get(0) + "\n");
        }

        //범위
        bw.write(Math.abs(list.get(0) - list.get(list.size() - 1)) + "");
        bw.close();
    }
}
