import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(arr);

        int range = (int) Math.round(n * 0.15);
        int sum = 0;

        for (int i = range; i < n - range; i++) {
            sum += arr.get(i);
        }
        
        int avg = Math.round((float) sum / (n - range * 2)); 
        System.out.println(avg);
    }
}