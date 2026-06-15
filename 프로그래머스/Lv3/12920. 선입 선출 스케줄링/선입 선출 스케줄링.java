class Solution {
    public int solution(int n, int[] cores) {
        int coreCnt = cores.length;
    
        if (n <= coreCnt) return n;

        int left = 0;
        int maxCoreTime = 0;
        
        for (int core : cores) {
            maxCoreTime = Math.max(maxCoreTime, core);
        }

        int right = maxCoreTime * n;
        int time = 0;
        
        while (left <= right) {
            int mid = (left + right) / 2;

            long cnt = getWorkCnt(mid, cores);

            if (cnt >= n) {
                time = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        long beforeCnt = getWorkCnt(time - 1, cores);

        for (int i = 0; i < coreCnt; i++) {
            if (time % cores[i] == 0) {
                beforeCnt++;

                if (beforeCnt == n) return i + 1;
            }
        }

        return -1;
    }

    private long getWorkCnt(int time, int[] cores) {
        long cnt = 0;
        for (int core : cores) {
            cnt += time / core + 1;
        }

        return cnt;
    }
}