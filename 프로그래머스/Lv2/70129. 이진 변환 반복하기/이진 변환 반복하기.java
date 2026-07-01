class Solution {
    public int[] solution(String s) {
        int tCnt = 0;
        int rCnt = 0;

        while (!s.equals("1")) {
            int oneCnt = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    oneCnt++;
                }
            }

            rCnt += s.length() - oneCnt;

            s = Integer.toBinaryString(oneCnt);

            tCnt++;
        }

        return new int[] { tCnt, rCnt };
    }
}