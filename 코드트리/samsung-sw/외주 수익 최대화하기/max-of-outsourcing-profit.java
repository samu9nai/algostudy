import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        int[] t = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int day = 0; day < n; day++) {
            dp[day + 1] = Math.max(dp[day + 1], dp[day]);

            int end = day + t[day];
            if (end <= n) {
                dp[end] = Math.max(dp[end], dp[day] + p[day]);
            }
        }

        System.out.println(dp[n]);
    }
}