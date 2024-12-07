import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            sb.append(count++).append(".");

            //n1
            n *= 3;
            boolean isEven = n % 2 == 0;
            sb.append(isEven ? " even " : " odd ");

            //n2
            if (!isEven) n += 1;
            n /= 2;

            //n3
            n *= 3;

            //n4
            sb.append(n / 9).append("\n");
        }

        System.out.println(sb);
    }
}