import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cook = Integer.parseInt(br.readLine());

        System.out.println((h + ((m + cook) / 60)) % 24 + " " + (m + cook) % 60);
    }
}