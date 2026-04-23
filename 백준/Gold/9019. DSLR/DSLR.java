import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;
    static char[] how;
    static boolean[] visited;

    static int D (int x) {
        return (x * 2) % 10000;
    }

    static int S (int x) {
        return (x == 0) ? 9999 : x - 1;
    }

    static int L (int x) {
        return (x % 1000) * 10 + x / 1000;
    }

    static int R (int x) {
        return (x % 10) * 1000 + x / 10;
    }

    static String bfs(int start, int target) {
        Queue<Integer> q = new ArrayDeque<>();
        visited = new boolean[10000];
        parent = new int[10000];
        how = new char[10000];

        q.offer(start);
        visited[start] = true;
        parent[start] = -1;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == target) break;

            // save current number's D, S, L, R operation result
            int next = D(cur);
            if (!visited[next]) {
                visited[next] = true;
                parent[next] = cur;
                how[next] = 'D';
                q.offer(next);
            }

            next = S(cur);
            if (!visited[next]) {
                visited[next] = true;
                parent[next] = cur;
                how[next] = 'S';
                q.offer(next);
            }

            next = L(cur);
            if (!visited[next]) {
                visited[next] = true;
                parent[next] = cur;
                how[next] = 'L';
                q.offer(next);
            }

            next = R(cur);
            if (!visited[next]) {
                visited[next] = true;
                parent[next] = cur;
                how[next] = 'R';
                q.offer(next);
            }
        }

        StringBuilder sb = new StringBuilder();
        int cur = target;

        while (parent[cur] != -1) { // backtracking (B -> A)
            sb.append(how[cur]);
            cur = parent[cur];
        }

        return sb.reverse().toString(); // A -> B
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(bfs(a, b)).append("\n");
        }

        System.out.println(sb);
    }
}