class Solution {
    public int solution(int n) {
        boolean[] isComposite = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }

        return count;
    }
}