class Solution {
    public String solution(String polynomial) {
        int x = 0, constant = 0;

        for (String term : polynomial.replace("+ ", "").split(" ")) {
            if (term.contains("x")) {
                String num = term.replace("x", "");
                x += num.isEmpty() ? 1 : Integer.parseInt(num);
            } else {
                constant += Integer.parseInt(term);
            }
        }
        
        return (x == 0 ? "" : (x == 1 ? "x" : x + "x")) +
               (constant == 0 ? "" : (x == 0 ? constant : " + " + constant));
    }
}