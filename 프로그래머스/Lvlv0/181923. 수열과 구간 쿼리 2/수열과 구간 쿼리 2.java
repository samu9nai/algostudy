class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    int tmp = arr[j];
                    min = Math.min(min, tmp);
                }
            }
            if (min == Integer.MAX_VALUE) min = -1;
            answer[i] = min;
        }
        return answer;
    }
}