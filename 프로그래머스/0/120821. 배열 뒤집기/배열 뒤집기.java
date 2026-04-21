class Solution {
    public int[] solution(int[] num_list) {
        int k = num_list.length;
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = num_list[k - 1 - i];
        }
        return answer;
    }
}