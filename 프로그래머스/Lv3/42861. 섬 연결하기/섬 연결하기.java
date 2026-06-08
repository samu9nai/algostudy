import java.util.*;

class Solution {

    int[] parent;

    public int solution(int n, int[][] costs) {
        int answer = 0;

        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));


        int cnt = 0;
        for (int[] cost : costs) {
            int a = cost[0];
            int b = cost[1];
            int bridgeCost = cost[2];

            if (find(a) != find(b)) {
                union(a, b);

                answer += bridgeCost;

                cnt++;

                if (cnt == n - 1) break;
            }
        }

        return answer;
    }

    private int find(int x) {
        if (parent[x] == x) return x;

        parent[x] = find(parent[x]);

        return parent[x];
    }

    private void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) return;

        parent[rootB] = rootA;
    }
}