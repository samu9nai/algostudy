import java.util.*;

class Solution {
    public int solution(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(s);
        
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            
            if (token.equals("Z")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}