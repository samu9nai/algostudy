class Solution {
    public int solution(int n) {
        int[] prefixSum = new int[n + 1];

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + i;
        }

        int left = 0, right = 1;
        int count = 0;

        while (left < right) {
            int sum = prefixSum[right] - prefixSum[left];

            if (sum < n) right++;
            else {
                if (sum == n) count++;
                left++;
            }
        }

        return count;
    }

}