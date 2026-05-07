class Solution {
    public int solution(int a, int b) {
        int denominator = b / gcd(a, b);
        
        while (denominator % 2 == 0) {
            denominator /= 2;
        }
        while (denominator % 5 == 0) {
            denominator /= 5;
        }
        
        return denominator == 1 ? 1 : 2;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}