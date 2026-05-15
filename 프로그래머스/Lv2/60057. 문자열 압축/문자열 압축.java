class Solution {
    public int solution(String s) {
        int n = s.length();
        int answer = n;

        for (int unit = 1; unit <= n / 2; unit++) {
            StringBuilder sb = new StringBuilder();

            String prev = s.substring(0, unit);
            int cnt = 1;

            for (int i = unit; i < n; i += unit) {
                int end = Math.min(i + unit, n);
                String cur = s.substring(i, end);

                if (prev.equals(cur)) {
                    cnt++;
                } 
                else {
                    if (cnt > 1) {
                        sb.append(cnt);
                    }
                    sb.append(prev);

                    prev = cur;
                    cnt = 1;
                }
            }

            if (cnt > 1) {
                sb.append(cnt);
            }
            sb.append(prev);

            answer = Math.min(answer, sb.length());
        }

        return answer;
    }
}