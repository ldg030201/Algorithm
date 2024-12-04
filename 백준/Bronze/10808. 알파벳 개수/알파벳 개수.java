import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] engArr = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (char c : br.readLine().toCharArray()) {
            engArr[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : engArr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}