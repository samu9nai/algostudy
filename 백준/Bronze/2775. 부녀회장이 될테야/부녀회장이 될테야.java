import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[][] apt = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            apt[0][i] = i;
        }

        for (int k = 1; k <= 14; k++) {
            for (int n = 1; n <= 14; n++) {
                if (n == 1) apt[k][n] = 1;
                else apt[k][n] = apt[k][n - 1] + apt[k - 1][n];
            }
        }

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(apt[k][n]));
            bw.newLine();
        }

        bw.flush();
    }
}