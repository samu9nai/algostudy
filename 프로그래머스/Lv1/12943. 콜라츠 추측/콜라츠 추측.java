class Solution {
    public int solution(int num) {
        int cnt = 0;
        if (num == 1) return 0;
        while (num > 0) {
            if (cnt == 500) break;
            
            if (num == 1) return cnt;
            else if (num % 2 == 0) {
                num /= 2;
                cnt++;
            } else {
                num = 3 * num + 1;
                cnt++;
            }
        }
        return -1;
    }
}