import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int nextInt;
        if (isNum(a)) {
            nextInt = Integer.parseInt(a) + 3;
        } else if (isNum(b)) {
            nextInt = Integer.parseInt(b) + 2;
        } else {
            nextInt = Integer.parseInt(c) + 1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (nextInt % 3 == 0 && nextInt % 5 == 0) {
            bw.write("FizzBuzz");
        } else if (nextInt % 3 == 0) {
            bw.write("Fizz");
        } else if (nextInt % 5 == 0) {
            bw.write("Buzz");
        } else {
            bw.write(String.valueOf(nextInt));
        }

        bw.close();
    }

    public static boolean isNum(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}