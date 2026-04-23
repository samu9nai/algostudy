import java.util.*;
import java.io.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] arr = str.toCharArray();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if('a' <= ch && ch <= 'z') arr[i] = (char)(ch +'A' - 'a');
            else arr[i] = (char)(ch + 'a' - 'A');  
        }

        System.out.println(arr);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
