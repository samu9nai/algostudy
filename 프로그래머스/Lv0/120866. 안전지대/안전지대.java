class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {1, 0, -1, 1, -1, 1, 0, -1};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];

                        if (x >= 0 && x < n && y >= 0 && y < n && board[x][y] == 0) {
                            board[x][y] = -1;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    answer ++;
                }
            }
        }
        return answer;        
    }
}