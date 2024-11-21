import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[][] map = new String[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        String[][] whiteMap = new String[map.length][map[0].length];

        //inputMap 채우기
        //whiteMap, BlackMap 채우기
        boolean isWhite = true;
        for (int i = 0; i < map.length; i++) {
            char[] c = br.readLine().toCharArray();
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = String.valueOf(c[j]);
                whiteMap[i][j] = isWhite ? "W": "B";
                isWhite = !isWhite;
            }
            isWhite = !"W".equals(whiteMap[i][0]); //아래는 반대로
        }

        int minCount = 65;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map.length - i >= 8 && map[i].length - j >= 8) {
                    int whiteCount = 0;
                    int blackCount = 0;
                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (!map[i + k][j + l].equals(whiteMap[i + k][j + l])) {
                                whiteCount++;
                            }
                            //블랙 맵은 반대로 하면 되어서 굳이 안만듬
                            if (map[i + k][j + l].equals(whiteMap[i + k][j + l])) {
                                blackCount++;
                            }
                        }
                    }
                    minCount = Math.min(minCount, Math.min(whiteCount, blackCount));
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(minCount));
        bw.close();
    }
}