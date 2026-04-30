import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        StringTokenizer st;
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < quiz.length; i++) {
            st = new StringTokenizer(quiz[i]);
            int result = Integer.parseInt(st.nextToken());
            
            if ("+".equals(st.nextToken())) {
                result += Integer.parseInt(st.nextToken());
            } else {
                result -= Integer.parseInt(st.nextToken());
            }
            String equals = st.nextToken();
            if (result == Integer.parseInt(st.nextToken())) {
                answer.add("O");
            } else {
                answer.add("X");
            }
        }
                
        return answer.toArray(new String[0]);
    }
}