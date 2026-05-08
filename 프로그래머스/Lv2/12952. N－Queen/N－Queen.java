class Solution {
    static int answer = 0;
    static boolean[] col;
    static boolean[] diag1;
    static boolean[] diag2;
    
    public int solution(int n) {
        col = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];
        
        dfs(0, n);
        
        return answer;
    }
    
    static void dfs(int row, int n) {
        if (row == n) {
            answer++;
            return;
        }
        
        for (int c = 0; c < n; c++) {
            if (col[c]) continue;
            if (diag1[row - c + n]) continue;
            if (diag2[row + c]) continue;
            
            col[c] = true;
            diag1[row - c + n] = true;
            diag2[row + c] = true;

            dfs(row + 1, n);
            
            col[c] = false;
            diag1[row - c + n] = false;
            diag2[row + c] = false;
        }
    }
}
