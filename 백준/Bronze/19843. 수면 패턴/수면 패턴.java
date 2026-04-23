import java.io.*;
import java.util.*;

public class Main {
    static List<String> days = List.of(new String[]{"Mon", "Tue", "Wed", "Thu", "Fri"});

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String d1 = st.nextToken();
            int h1 = Integer.parseInt(st.nextToken());
            String d2 = st.nextToken();
            int h2 = Integer.parseInt(st.nextToken());

            if (!d1.equals(d2)) {
                t -= 24 * (days.indexOf(d2) - days.indexOf(d1));
            }
            t -= (h2 - h1);
        }

        if (t > 48) {
            t = -1;
        } else if (t < 0 && t > - 49) {
            t = 0;
        }

        System.out.println(t);
    }
}