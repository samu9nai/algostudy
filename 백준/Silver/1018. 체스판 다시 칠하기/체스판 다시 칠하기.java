import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = 32; // 최악 -> 아예 검은 판이거나 아예 하얀 판
        for (int r = 0; r <= n - 8; r++) {
            for (int c = 0; c <= m - 8; c++) {
                int paintWhite = 0;  // 맨 왼쪽 위 칸이 흰색인 경우
                int paintBlack = 0;  // 맨 왼쪽 위 칸이 검은색인 경우

                for (int i = r; i < r + 8; i++) {
                    for (int j = c; j < c + 8; j++) {
                        if ((i + j) % 2 == 0) {
                            if (board[i][j] == 'B') {
                                paintWhite++;
                            } else {
                                paintBlack++;
                            }
                        } else {
                            if (board[i][j] == 'W') {
                                paintWhite++;
                            } else {
                                paintBlack++;
                            }
                        }
                    }
                }

                min = Math.min(min, Math.min(paintBlack, paintWhite));
            }
        }

        System.out.println(min);
    }
}