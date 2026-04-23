import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            Deque<Integer> docDeque = new ArrayDeque<>();
            Deque<Integer> priorityDeque = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                docDeque.offer(i);
                priorityDeque.offer(Integer.valueOf(st.nextToken()));
            }

            solution(index, docDeque, priorityDeque);
        }
    }

    private static void solution(int index,
    Deque<Integer> deque,
    Deque<Integer> priorityDeque) {
        int cnt = 1;

        while (!deque.isEmpty()) {
            int max = Collections.max(priorityDeque);
            int docIndex = deque.pollFirst();
            int docPriority = priorityDeque.pollFirst();

            if (docPriority != max) {
                deque.offerLast(docIndex);
                priorityDeque.offerLast(docPriority);
            } else {
                if (docIndex == index) {
                    System.out.println(cnt);
                    break;
                }
                cnt++;
            }
        }
    }
}