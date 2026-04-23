import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int doom = 666;

        while (true) {
            if (String.valueOf(doom).contains("666")) {
                n--;

                if (n == 0) break;
            }
            doom++;
        }

        System.out.println(doom);
    }
}