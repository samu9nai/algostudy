class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int n : array) {
            String str = String.valueOf(n);
            
            for (char c : str.toCharArray()) {
                if (c == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}