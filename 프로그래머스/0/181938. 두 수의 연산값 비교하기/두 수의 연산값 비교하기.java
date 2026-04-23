class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a + "" + b);
        int tab = 2 * a * b;
        int answer = ab >= tab ? ab : tab;
        return answer;
    }
}