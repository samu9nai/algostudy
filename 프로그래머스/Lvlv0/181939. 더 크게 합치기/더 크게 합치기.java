class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a) + String.valueOf(b);
        String str2 = String.valueOf(b) + String.valueOf(a);
        
        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        
        answer = (int1 >= int2) ? int1 : int2;
        return answer;
    }
}