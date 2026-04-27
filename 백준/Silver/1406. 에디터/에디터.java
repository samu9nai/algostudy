import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<Character> frontCur = new ArrayDeque<>();
        Deque<Character> rearCur = new ArrayDeque<>();

        String s = br.readLine();
        for (char c : s.toCharArray()) {
            frontCur.offerLast(c);
        }

        int m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);

            if (c == 'L') {
                if (!frontCur.isEmpty()) rearCur.offerFirst(frontCur.pollLast());
            } else if (c == 'D') {
                if (!rearCur.isEmpty()) frontCur.offerLast(rearCur.pollFirst());
            } else if (c == 'B') {
                if (!frontCur.isEmpty()) frontCur.pollLast();
            } else {
                frontCur.offerLast(st.nextToken().charAt(0));
            }
        }

        while (!frontCur.isEmpty()) {
            sb.append(frontCur.pollFirst());
        }
        while (!rearCur.isEmpty()) {
            sb.append(rearCur.pollFirst());
        }

        System.out.println(sb);
    }
}