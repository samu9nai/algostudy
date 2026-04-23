import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int y0 = Integer.parseInt(st.nextToken());
        int m0 = Integer.parseInt(st.nextToken());
        int d0 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int y1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        int[][] host = new int[n][3];
        int happy = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            host[i][0] = Integer.parseInt(st.nextToken());
            host[i][1] = Integer.parseInt(st.nextToken());
            host[i][2] = Integer.parseInt(st.nextToken());

            if (host[i][1] == m0 && host[i][2] == d0) { // today is party day
                happy = y0 - host[i][0];
            }
        }

        long cnt = 0;

        for (int i = 0; i < n; i++) {
            int y = host[i][0];
            int m = host[i][1];
            int d = host[i][2];

            for (int year = y0; year <= y1; year++) {
                if (year == y0) {
                    if (m < m0 || (m == m0 && d <= d0)) continue; // except before y0-m0-d0 (today)
                }

                if (year == y1) {
                    if (m > m1 || (m == m1 && d > d1)) continue; // except after y1-m1-d1 (mouse lui out)
                }

                int newHappy = year - y;
                if (newHappy > happy) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}