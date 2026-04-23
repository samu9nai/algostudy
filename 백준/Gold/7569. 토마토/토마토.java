import java.io.*;
import java.util.*;

public class Main {
    static int[] dh = {-1, 1, 0, 0, 0, 0};
    static int[] dr = {0, 0, -1, 1, 0, 0};
    static int[] dc = {0, 0, 0, 0, -1, 1};
    static int[][][] box;
    static int m, n, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        box = new int[h][n][m];
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());

                    if (box[i][j][k] == 1) {
                        q.offer(new int[]{i, j, k});
                    }
                }
            }
        }

        bfs(q);
        
        int max = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (box[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, box[i][j][k]);
                }
            }
        }

        System.out.println(max - 1);
    }

    static void bfs(Queue<int[]> q) {
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int hi = cur[0];
            int r = cur[1];
            int c = cur[2];

            for (int d = 0; d < 6; d++) {
                int nh = hi + dh[d];
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nh < 0 || nh >= h || nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    continue;
                }

                if (box[nh][nr][nc] != 0) {
                    continue;
                }

                box[nh][nr][nc] = box[hi][r][c] + 1;
                q.offer(new int[]{nh, nr, nc});
            }
        }
    }
}