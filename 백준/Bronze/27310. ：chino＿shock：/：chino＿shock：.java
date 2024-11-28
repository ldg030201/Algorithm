import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] word = br.readLine().toCharArray();
        int score = word.length;

        for (char c : word) {
            if (c == ':') {
                score++;
            } else if (c == '_') {
                score += 5;
            }
        }
        System.out.println(score);
    }
}