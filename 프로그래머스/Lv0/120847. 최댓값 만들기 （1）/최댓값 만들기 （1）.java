import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int k = numbers.length;
        
        return numbers[k - 1] * numbers[k - 2];
    }
}