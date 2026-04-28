import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }

        if (direction.equals("right")) {
            list.add(0, list.remove(list.size() - 1));
        } else {
            list.add(list.remove(0));
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}