class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char cur = code.charAt(i);
            
            if (cur == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            if (i % 2 == mode) sb.append(cur);
        }
        
        return (sb.length() == 0) ? "EMPTY" : sb.toString();
    }
}