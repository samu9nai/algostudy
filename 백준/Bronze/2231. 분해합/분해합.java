import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            int gen = i;
            int constSum = gen;

            while (gen > 0) {
                constSum += gen % 10;
                gen /= 10;
            }

            if (constSum == n) {
                System.out.println(i);
                return;
            }
        }
        
        System.out.println(0);
    }
}