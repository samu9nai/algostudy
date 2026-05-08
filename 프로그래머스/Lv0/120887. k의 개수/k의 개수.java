import java.util.stream.IntStream;

class Solution {
    public int solution(int i, int j, int k) {
        return IntStream.rangeClosed(i, j)
                        .map(n -> String.valueOf(n).length() - String.valueOf(n).replace(String.valueOf(k), "").length())
                        .sum();
    }
}