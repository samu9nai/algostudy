import java.io.*;

public class Main {
    static final int R = 31;
    static final int M = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long ans = 0;

        for (int i = 0; i < l; i++) {
            ans += (str.charAt(i) - 'a' + 1) * pow(R, i);
        }
        System.out.println(ans % M);
    }

    static long pow(int a, int b) {
        return b == 0 ? 1 : a * pow(a, b - 1) % M;
    }
}