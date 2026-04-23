import java.util.*;
import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(str.charAt(i - 1));
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}