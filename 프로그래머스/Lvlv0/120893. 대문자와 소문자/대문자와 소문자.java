class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for (char s : my_string.toCharArray()) {
            if (Character.isUpperCase(s)) {
                sb.append(Character.toLowerCase(s));
            } else {
                sb.append(Character.toUpperCase(s));
            }
        }
        return sb.toString();
    }
}