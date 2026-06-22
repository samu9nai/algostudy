import java.util.*;

class Solution {
    public long solution(int[] a, int[][] edges) {
        int n = a.length;

        long[] weight = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            weight[i] = a[i];
            sum += weight[i];
        }

        if (sum != 0) return -1;

        if (n == 1) return 0;

        List<Integer>[] graph = new ArrayList[n];
        int[] degree = new int[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);

            degree[u]++;
            degree[v]++;
        }

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) q.offer(i);
        }

        boolean[] removed = new boolean[n];
        int remain = n;
        long answer = 0;

        while (!q.isEmpty() && remain > 1) {
            int cur = q.poll();

            if (removed[cur]) continue;

            removed[cur] = true;
            remain--;

            answer += Math.abs(weight[cur]);

            for (int next : graph[cur]) {
                if (!removed[next]) {
                    weight[next] += weight[cur];

                    degree[next]--;

                    if (degree[next] == 1) q.offer(next);

                    break;
                }
            }
        }

        return answer;
    }
}