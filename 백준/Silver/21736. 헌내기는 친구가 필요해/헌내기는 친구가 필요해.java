import java.io.*;
import java.util.*;

public class Main {
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int n, m;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        int sr = -1; // start row
        int sc = -1; // start column

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'I') {
                    sr = i;
                    sc = j;
                }
            }
        }

        int cnt = bfs(sr, sc);
        if (cnt > 0) {
            System.out.println(cnt);
        } else {
            System.out.println("TT");
        }
    }

    static int bfs(int startR, int startC) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{startR, startC});

        boolean[][] visited = new boolean[n][m];
        visited[startR][startC] = true;

        int cnt = 0;

        while (!q.isEmpty()) {
            int[] node = q.poll();
            if (map[node[0]][node[1]] == 'P') cnt++;

            for (int d = 0; d < 4; d++) {
                int nr = node[0] + dr[d];
                int nc = node[1] + dc[d];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (map[nr][nc] == 'X' || visited[nr][nc]) continue;

                q.offer(new int[]{nr, nc});
                visited[nr][nc] = true;
            }
        }
        return cnt;
    }
}