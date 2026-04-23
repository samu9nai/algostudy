import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 100_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());        
        int k = Integer.parseInt(st.nextToken());
        
        System.out.println(bfs(n, k));
    }

    static int bfs(int n, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(n);

        boolean[] visited = new boolean[MAX + 1];
        visited[n] = true;

        int dist = 0;

        while (!q.isEmpty()) { 
            int size = q.size();

            while (size-- > 0) {
                int now = q.poll();
                if (now == k) return dist;

                int minusWalk = now - 1;
                if (minusWalk >= 0 && !visited[minusWalk]) {
                    q.offer(minusWalk);
                    visited[minusWalk] = true;
                }

                int plusWalk = now + 1;
                if (plusWalk <= MAX && !visited[plusWalk]) {
                    q.offer(plusWalk);
                    visited[plusWalk] = true;
                }

                int tp = now * 2;
                if (tp <= MAX && !visited[tp]) {
                    q.offer(tp);
                    visited[tp] = true;
                }
            }

            dist++;
        }

        return -1;
    }
}