import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 4000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int sum = 0;
        int[] cnt = new int[2 * MAX + 1]; // -4000 ~ +4000, include 0

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            cnt[arr[i] + MAX]++; // cnt[]'s index: 0 ~ 8001, so arr[i] + MAX
        }
        Arrays.sort(arr);

        int maxEncounter = 0; // largest value of mode's encounter
        int cntMax = 0; // number of values which have maxEncounter

        for (int x : cnt) {
            if (x > maxEncounter) {
                maxEncounter = x;
                cntMax = 1;
            } else if (x == maxEncounter) {
                cntMax++;
            }
        }
        cntMax = Math.min(cntMax, 2); // to find second min value of mode

        int mode = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == maxEncounter) cntMax--; // to find second min value of mode
            if (cntMax == 0) {
                mode = i - MAX; // index - 4000 = real value
                break;
            }
        }

        System.out.println(Math.round((double) sum / n)); // arithmetic mean
        System.out.println(arr[n / 2]); // median
        System.out.println(mode); // mode
        System.out.println(arr[n - 1] - arr[0]); // range
    }
}