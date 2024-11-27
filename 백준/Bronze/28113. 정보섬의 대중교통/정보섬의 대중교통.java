import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); //걸어가는 시간
        int a = Integer.parseInt(st.nextToken()); //버스
        int b = Integer.parseInt(st.nextToken()); //지하철

        //a은 b보다 작거나 같기 때문에 비교가 필요한가..?
        if (a > b) {
            System.out.println("Subway");
        } else if (a < b) {
            System.out.println("Bus");
        } else {
            System.out.println("Anything");
        }
    }
}