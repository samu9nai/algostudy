import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        for (int i = n - 5; i < n; i++) {
            sb.append(s.charAt(i));
        }

        System.out.println(sb);
    }
}