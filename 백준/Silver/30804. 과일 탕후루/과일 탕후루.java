import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] tanghulu = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tanghulu[i] = Integer.parseInt(st.nextToken());
        }

        int[] count = new int[10]; // number of each fruit, count[1] ~ count[9]
        int kind = 0;
        int left = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {
            int fruit = tanghulu[right];

            if (count[fruit] == 0) {
                kind++;
            }
            count[fruit]++;

            while (kind > 2) {
                int leftFruit = tanghulu[left];
                count[leftFruit]--; // pop

                if (count[leftFruit] == 0) {
                    kind--;
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
    }
}