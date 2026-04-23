import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String plus = Integer.toString(a) + Integer.toString(b);
        int minus = Integer.parseInt(plus) - c;

        System.out.println(a + b - c);
        System.out.println(minus);
    }
}