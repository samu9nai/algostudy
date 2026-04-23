import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int sqrt = (int) Math.sqrt(n);
            System.out.println(sqrt * sqrt == n ? 1 : 0);
        }
    }
}