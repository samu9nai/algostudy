import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] cable = new int[k];
        long max = 0;

        for (int i = 0; i < k; i++) {
            cable[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, cable[i]); // initial value of binary search 
        }

        long left = 1;
        long right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            long count = 0;
            for (int c : cable) {
                count += c / mid; // cut cables
            }

            if (count >= n) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}