import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] log = new int[n];
        long max = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            log[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, log[i]);
        }

        long left = 0;
        long right = max;
        long ans = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            long cnt = 0;
            for (int l : log) {
                if (l > mid) cnt += (l - mid); // cut log
            }

            if (cnt >= m) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(ans);
    }
}