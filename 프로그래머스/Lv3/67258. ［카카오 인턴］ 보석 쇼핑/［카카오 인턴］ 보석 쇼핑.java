import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        Set<String> gemTypes = new HashSet<>(Arrays.asList(gems));
        int totalTypes = gemTypes.size();

        Map<String, Integer> window = new HashMap<>();

        int left = 0;
        int answerStart = 0;
        int answerEnd = gems.length - 1;

        for (int right = 0; right < gems.length; right++) {
            String rightGem = gems[right];

            window.put(rightGem, window.getOrDefault(rightGem, 0) + 1);

            while (window.size() == totalTypes) {
                if (right - left < answerEnd - answerStart) {
                    answerStart = left;
                    answerEnd = right;
                }

                String leftGem = gems[left];
                int count = window.get(leftGem);
                if (count == 1) {
                    window.remove(leftGem);
                } else {
                    window.put(leftGem, count - 1);
                }

                left++;
            }
        }

        return new int[] { answerStart + 1, answerEnd + 1 };
    }
}