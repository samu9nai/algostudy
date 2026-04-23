import java.io.*;
import java.util.*;

public class Main {

    static int[] dr = { -1, 0, 1, 0 };
    static int[] dc = { 0, 1, 0, -1 };
    static int n;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        map = new char[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int cpx = 0; // num of complex
        List<Integer> list = new ArrayList<>(); // houses in each complex

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '1') {
                    cpx++;
                    list.add(dfs(i, j));
                }
            }
        }
        Collections.sort(list);

        sb.append(cpx).append("\n");
        for (int x : list) {
            sb.append(x).append("\n");
        }

        System.out.print(sb);
    }

    static int dfs(int r, int c) {
        map[r][c] = '0';
        int house = 1;

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue; // out of map
            if (map[nr][nc] == '0') continue; // already visited

            house += dfs(nr, nc);
        }

        return house;
    }
}