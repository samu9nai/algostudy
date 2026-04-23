import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameToNum = new HashMap<>();
        String[] numToName = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameToNum.put(name, i);
            numToName[i] = name;
        }

        StringBuilder sb = new StringBuilder();

        while (m-- > 0) {
            String q = br.readLine();

            if (Character.isDigit(q.charAt(0))) {
                sb.append(numToName[Integer.parseInt(q)]).append('\n');
            } else {
                sb.append(nameToNum.get(q)).append('\n');
            }
        }

        System.out.print(sb);
    }
}