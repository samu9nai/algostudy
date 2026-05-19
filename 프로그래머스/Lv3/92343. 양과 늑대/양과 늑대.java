import java.util.*;

class Solution {
    List<Integer>[] tree;
    int[] info;
    int answer = 0;

    public int solution(int[] info, int[][] edges) {
        this.info = info;
        int n = info.length;
        tree = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];

            tree[parent].add(child);
        }

        List<Integer> candidates = new ArrayList<>();
        candidates.add(0);

        dfs(0, 0, candidates);

        return answer;
    }

    private void dfs(int sheep, int wolf, List<Integer> candidates) {
        for (int i = 0; i < candidates.size(); i++) {
            int node = candidates.get(i);
            int nextSheep = sheep;
            int nextWolf = wolf;

            if (info[node] == 0) nextSheep++;
            else nextWolf++;

            if (nextWolf >= nextSheep) continue;

            answer = Math.max(answer, nextSheep);

            List<Integer> nextCandidates = new ArrayList<>(candidates);

            nextCandidates.remove(i);

            for (int child : tree[node]) {
                nextCandidates.add(child);
            }

            dfs(nextSheep, nextWolf, nextCandidates);
        }
    }
}