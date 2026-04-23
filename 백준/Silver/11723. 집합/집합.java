import java.io.*;
import java.util.*;

public class Main {
    static boolean[] s = new boolean[20];

    static void add(int x) {
        s[x - 1] = true;
    }

    static void remove(int x) {
        s[x - 1] = false;
    }

    static boolean check(int x) {
        return s[x - 1];
    }

    static void toggle(int x) {
        s[x - 1] = !s[x - 1];
    }

    static void all() {
        for (int i = 0; i < 20; i++) {
            s[i] = true;
        }
    }

    static void empty() {
        for (int i = 0; i < 20; i++) {
            s[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());

        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("all")) {
                all();
            } else if (cmd.equals("empty")) {
                empty();
            } else {
                int x = Integer.parseInt(st.nextToken());

                if (cmd.equals("add")) {
                    add(x);
                } else if (cmd.equals("remove")) {
                    remove(x);
                } else if (cmd.equals("check")) {
                    sb.append(check(x) ? "1\n" : "0\n");
                } else if (cmd.equals("toggle")) {
                    toggle(x);
                }
            }
        }

        System.out.print(sb);
    }
}