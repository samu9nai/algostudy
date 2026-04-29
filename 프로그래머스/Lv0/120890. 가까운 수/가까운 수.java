class Solution {
    public int solution(int[] array, int n) {
        
        int minGap = Math.abs(n - array[0]);
        int answer = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if ((Math.abs(n - array[i]) < minGap) || 
                (Math.abs(n - array[i]) == minGap && array[i] < answer)) {
                answer = array[i];
                minGap = Math.abs(n - array[i]);
            } 
        }
        
        return answer;
    }
}