import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static ArrayList<Integer>[] graph;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
        parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        bfs();

        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append('\n');
        }

        System.out.print(sb);
    }

    static void bfs() {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        parent[1] = -1;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int next : graph[cur]) {
                if (parent[next] == 0) {
                    parent[next] = cur;
                    queue.offer(next);
                }
            }
        }
    }
}