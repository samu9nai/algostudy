import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        return IntStream.of(arr)
            .filter(i -> IntStream.of(delete_list).noneMatch(j-> j==i))
            .toArray();
    }
}