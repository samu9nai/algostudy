class Solution {
    public int solution(int[] common) {
       
        return ((double) common[2] / common[1] == (double) common[1] / common[0]) ? (int) (common[common.length - 1] * (double) common[1] / common[0]) : common[common.length - 1] + common[1] - common[0];
    }
}