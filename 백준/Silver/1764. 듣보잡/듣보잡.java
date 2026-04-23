import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> notHeard = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            notHeard.add(br.readLine());
        }

        Set<String> notSeen = new HashSet<>();
        for (int i = 0; i < m; i++) {
            notSeen.add(br.readLine());
        }

        notHeard.retainAll(notSeen);

        sb.append(notHeard.size()).append("\n");
        for (String str : notHeard) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}