import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();

        int n = progresses.length;

        int deployDay = getDays(progresses[0], speeds[0]);
        int count = 1;

        for (int i = 1; i < n; i++) {
            int days = getDays(progresses[i], speeds[i]);

            if (days <= deployDay) {
                count++;
            } 
            else {
                result.add(count);
                deployDay = days;
                count = 1;
            }
        }

        result.add(count);

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int getDays(int progress, int speed) {
        return (100 - progress + speed - 1) / speed;
    }
}