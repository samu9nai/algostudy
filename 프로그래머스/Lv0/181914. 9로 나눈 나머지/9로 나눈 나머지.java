class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] numArr = number.toCharArray();
        for (char n : numArr) {
            answer += n - '0';
        }
        
        return answer % 9;
    }
}