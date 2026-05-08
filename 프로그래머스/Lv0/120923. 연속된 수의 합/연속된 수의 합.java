import java.util.stream.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        for (int i = -1000; i <= 1000; i++) {
            if (IntStream.rangeClosed(i, i + num - 1).sum() == total) {
                return IntStream.rangeClosed(i, i + num - 1).toArray();
            }
        }
        return answer;
    }
}