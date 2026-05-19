class Solution {
    public String solution(String play_time, String adv_time, String[] logs) {
        int play = toSeconds(play_time);
        int adv = toSeconds(adv_time);

        long[] time = new long[play + 2];

        for (String log : logs) {
            int start = toSeconds(log.substring(0, 8));
            int end = toSeconds(log.substring(9, 17));

            time[start] += 1;
            time[end] -= 1;
        }

        for (int i = 1; i <= play; i++) {
            time[i] += time[i - 1];
        }

        long[] prefix = new long[play + 2];

        for (int i = 0; i < play; i++) {
            prefix[i + 1] = prefix[i] + time[i];
        }

        long maxViewTime = -1;
        int answerStart = 0;

        for (int start = 0; start + adv <= play; start++) {
            int end = start + adv;

            long currentViewTime = prefix[end] - prefix[start];

            if (currentViewTime > maxViewTime) {
                maxViewTime = currentViewTime;
                answerStart = start;
            }
        }

        return toTime(answerStart);
    }

    private int toSeconds(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        int second = Integer.parseInt(time.substring(6, 8));

        return hour * 3600 + minute * 60 + second;
    }

    private String toTime(int seconds) {
        int hour = seconds / 3600;
        seconds %= 3600;

        int minute = seconds / 60;
        int second = seconds % 60;

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}