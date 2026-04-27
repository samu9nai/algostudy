import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        int row = 2 * N;
        int col = 4 * N + 2;

        char[][] arr = new char[row][col];

        for (int i = 0; i < row; i++) {
            Arrays.fill(arr[i], ' ');
        }

        for (int i = 0; i < row; i++) {
            int c1 = 2 * N - 1 - i;

            int c2;
            if (i < N) {
                c2 = 3 * N - i;
            } else {
                c2 = i + N + 1;
            }

            int c3;
            if (i < N) {
                c3 = 3 * N + 2 + i;
            } else {
                c3 = 5 * N + 1 - i;
            }

            arr[i][c1] = '*';
            arr[i][c2] = '*';
            arr[i][c3] = '*';
        }

        for (int i = 0; i < row; i++) {
            sb.append(arr[i]).append('\n');
        }

        System.out.print(sb);
    }
}