import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long testCount = Long.parseLong(br.readLine());

        long score;
        long totalScore;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (testCount-- > 0) {
            score = 1;
            totalScore = 0;
            for (char c : br.readLine().toCharArray()) {
                if (c == 'O') {
                    totalScore += score;
                    score++;
                } else {
                    score = 1;
                }
            }
            bw.write(totalScore + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}