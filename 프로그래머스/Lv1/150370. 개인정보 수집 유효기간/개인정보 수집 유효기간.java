import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();

        for (String term : terms) {
            String[] split = term.split(" ");
            String type = split[0];
            int month = Integer.parseInt(split[1]);

            termMap.put(type, month);
        }

        int todayDays = toDays(today);

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");

            String collectedDate = split[0];
            String type = split[1];

            int collectedDays = toDays(collectedDate);
            int validMonth = termMap.get(type);

            int expireDays = collectedDays + validMonth * 28;

            if (expireDays <= todayDays) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private int toDays(String date) {
        String[] split = date.split("\\.");

        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        return year * 12 * 28 + month * 28 + day;
    }
}