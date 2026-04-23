import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        print(n, sb, 3);
        print(n, sb, 2);
        print(n, sb, 0);
        print(n, sb, 2);
        print(n, sb, 3);
        System.out.println(sb);
    }

    static void print(int n, StringBuilder sb, int gap) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append('@');
            }
            for (int j = 0; j < gap*n; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < n; j++) {
                sb.append('@');
            }
            if (gap == 0) {
                for (int j = 0; j < n; j++) {
                    sb.append('@');
                }
            }
            sb.append('\n');
        }
    }
}