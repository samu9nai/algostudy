import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int ans = 0;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];        

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, map[i][j]);
                visited[i][j] = false;

                checkTBlock(i, j); // T block
            }
        }

        System.out.println(ans);
    }

    static void dfs(int r, int c, int depth, int sum) {
        // complete tetromino
        if (depth == 4) {
            ans = Math.max(ans, sum);
            return;
        }

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
            if (visited[nr][nc]) continue;

            visited[nr][nc] = true;
            dfs(nr, nc, depth + 1, sum + map[nr][nc]);
            visited[nr][nc] = false;
        }
    }

    static void checkTBlock(int r, int c) {
        int center = map[r][c];
        int wingSum = 0;
        int minWing = Integer.MAX_VALUE;
        int cnt = 0;

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;

            cnt++;
            wingSum += map[nr][nc];
            minWing = Math.min(minWing, map[nr][nc]);
        }

        if (cnt < 3) return; // cannot make T block
        if (cnt == 3) { // center + 3-way
            ans = Math.max(ans, center + wingSum);
        } else { // cnt == 4, center + 4-way
            ans = Math.max(ans, center + wingSum - minWing);
        }
    }
}