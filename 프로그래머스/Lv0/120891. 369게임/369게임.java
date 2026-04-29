class Solution {
    public int solution(int order) {
        String str = Integer.toString(order);
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') answer++;
        }
        return answer;
    }
}