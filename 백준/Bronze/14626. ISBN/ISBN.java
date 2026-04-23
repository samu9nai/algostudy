import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = 0;
        int idx = 0;

        for (int i = 0; i < 13; i++) {
            if (str.charAt(i) == '*') idx = i;
            else sum += (str.charAt(i) - '0') * (i % 2 == 0 ? 1 : 3);
        }

        for (int i = 0; i < 10; i++) {
            if ((sum + i * (idx % 2 == 0 ? 1 : 3)) % 10 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}