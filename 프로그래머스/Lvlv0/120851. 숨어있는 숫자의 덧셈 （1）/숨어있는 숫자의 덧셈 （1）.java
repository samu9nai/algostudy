class Solution {
    public int solution(String my_string) {
        return my_string.chars()
                        .filter(c -> Character.isDigit(c))
                        .map(c -> Character.getNumericValue(c))
                        .sum();
    }
}