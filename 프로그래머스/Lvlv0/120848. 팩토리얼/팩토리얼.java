class Solution {
    public int solution(int n) {
        int i = 1;
        long fact = 1;
        
        while (true) {
            fact *= i;
            
            if (fact > n) {
                return i - 1;
            }
            
            i++;
        }    
    }
}