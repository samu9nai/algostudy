import java.util.*;

class Solution {
    private Map<String, Integer> map;

    public String[] solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = new String(arr);
        }

        for (int len : course) {
            map = new HashMap<>();

            for (String order : orders) {
                if (order.length() >= len) {
                    makeCombination(order, len, 0, new StringBuilder());
                }
            }

            int maxCount = 0;
            for (int count : map.values()) {
                maxCount = Math.max(maxCount, count);
            }

            if (maxCount < 2) continue;

            for (String menu : map.keySet()) {
                if (map.get(menu) == maxCount) {
                    answer.add(menu);
                }
            }
        }

        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }

    private void makeCombination(String order, int targetLen, int start, StringBuilder sb) {
        if (sb.length() == targetLen) {
            String menu = sb.toString();
            map.put(menu, map.getOrDefault(menu, 0) + 1);
            return;
        }

        for (int i = start; i < order.length(); i++) {
            sb.append(order.charAt(i));

            makeCombination(order, targetLen, i + 1, sb);

            sb.deleteCharAt(sb.length() - 1);
        }
    }
}