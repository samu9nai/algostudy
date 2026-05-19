import java.util.*;

class Solution {
    int n, m;
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;

        boolean[][] visited = new boolean[n][m];
        int[] oilInCol = new int[m];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (land[r][c] == 1 && !visited[r][c]) {
                    Set<Integer> columns = new HashSet<>();

                    int size = bfs(land, visited, r, c, columns);

                    for (int col : columns) {
                        oilInCol[col] += size;
                    }
                }
            }
        }

        int answer = 0;
        for (int oil : oilInCol) {
            answer = Math.max(answer, oil);
        }

        return answer;
    }

    private int bfs(int[][] land, boolean[][] visited, int sr, int sc, Set<Integer> columns) {
        Queue<int[]> q = new ArrayDeque<>();

        q.offer(new int[]{sr, sc});
        visited[sr][sc] = true;

        int size = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            size++;
            columns.add(c);

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (visited[nr][nc]) continue;
                if (land[nr][nc] == 0) continue;

                visited[nr][nc] = true;
                q.offer(new int[]{nr, nc});
            }
        }

        return size;
    }
}