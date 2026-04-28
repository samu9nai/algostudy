class Solution {
    public int solution(int a, int b, int c) {
        int sum = a + b + c;
        int powsum = a * a + b * b + c * c;
        int cubsum = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)); 
        if (a == b && b == c) return sum * powsum * cubsum;
        else if ((a == b && b != c) || (a == c && b != c) || (b == c && a != b)) return sum * powsum;
        else return sum;
    }
}