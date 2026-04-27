import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            long maxA = 0;
            long maxB = 0;
            long maxC = 0;

            boolean possible = true;

            for (int i = 1; i <= n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());
                long p = Long.parseLong(st.nextToken());

                maxA = Math.max(maxA, a);
                maxB = Math.max(maxB, b);
                maxC = Math.max(maxC, c);

                long needDays = maxA + maxB + maxC + i;

                if (needDays > p) {
                    possible = false;
                }
            }

            sb.append(possible ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }
}