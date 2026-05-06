class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        for (String s : keyinput) {
            if ("left".equals(s) && answer[0] > -board[0] / 2) {
                answer[0] --;
            } else if ("right".equals(s) && answer[0] < board[0] / 2) {
                answer[0] ++;
            } else if ("up".equals(s) && answer[1] < board[1] / 2) {
                answer[1] ++;
            } else if ("down".equals(s) && answer[1] > -board[1] / 2) {
                answer[1] --;
            }
        }
        return answer;
    }
}