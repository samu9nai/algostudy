import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] toOne = new int[n + 1];
        toOne[1] = 0;

        for (int i = 2; i <= n; i++) {
            toOne[i] = toOne[i - 1] + 1; // x - 1 operation

            if (i % 2 == 0) { // x / 2 operation 
                toOne[i] = Math.min(toOne[i], toOne[i / 2] + 1);
            }

            if (i % 3 == 0) { // x / 3 operation 
                toOne[i] = Math.min(toOne[i], toOne[i / 3] + 1);
            }
        }

        System.out.println(toOne[n]);
    }
}