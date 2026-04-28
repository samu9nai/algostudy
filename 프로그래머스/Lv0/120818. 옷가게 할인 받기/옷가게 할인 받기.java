class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if (price >= 100000 && price < 300000) {
            answer = (int) (0.95 * price);
        } else if (price >= 300000 && price < 500000) {
            answer = (int) (0.9 * price);
        } else if (price >= 500000) {
            answer = (int) (0.8 * price);
        } else {
            answer = price;
        }
        return answer;
    }
}