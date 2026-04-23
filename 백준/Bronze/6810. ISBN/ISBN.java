import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int sum = 91 + a + 3 * b + c;

        System.out.println("The 1-3-sum is " + sum);
    }
}