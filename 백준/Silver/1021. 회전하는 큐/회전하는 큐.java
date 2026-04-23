import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            dq.offerLast(i);
        }

        st = new StringTokenizer(br.readLine());
        int ans = 0;

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int idx = 0;
            for (int num : dq) {
                if (num == target) break;
                idx++;
            }

            int size = dq.size();

            if (idx <= size / 2) { // operation 2
                while (dq.peekFirst() != target) {
                    dq.offerLast(dq.pollFirst());
                    ans++;
                }
            }

            else { // operation 3
                while (dq.peekFirst() != target) {
                    dq.offerFirst(dq.pollLast());
                    ans++;
                }
            }

            dq.pollFirst(); // operation 1
        }

        System.out.println(ans);
    }
}