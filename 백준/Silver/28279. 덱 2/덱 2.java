import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            if (cmd == 1) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            } else if (cmd == 2) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            } else if (cmd == 3) {
                sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append("\n");
            } else if (cmd == 4) {
                sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append("\n");
            } else if (cmd == 5) {
                sb.append(dq.size()).append("\n");
            } else if (cmd == 6) {
                sb.append(dq.isEmpty() ? 1 : 0).append("\n");
            } else if (cmd == 7) {
                sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append("\n");
            } else if (cmd == 8) {
                sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append("\n");
            }
        }
        System.out.print(sb);
    }
}