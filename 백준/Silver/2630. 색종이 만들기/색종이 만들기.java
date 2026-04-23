import java.io.*;
import java.util.*;

public class Main {

    static int[][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    static void divide(int r, int c, int size) {
        if (isSameColor(r, c, size)) {
            if (paper[r][c] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int half = size / 2;

        divide(r, c, half); // left top
        divide(r, c + half, half); // right top
        divide(r + half, c, half); // left bottom
        divide(r + half, c + half, half); // right bottom
    }

    static boolean isSameColor(int r, int c, int size) {
        int color = paper[r][c]; // 0 -> white, 1 -> blue

        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
