class Solution {

    public int[] solution(long n) {
        return new StringBuilder(String.valueOf(n)).reverse()
                                                   .toString()
                                                   .chars()
                                                   .map(i -> i - '0')
                                                   .toArray();
    }

}