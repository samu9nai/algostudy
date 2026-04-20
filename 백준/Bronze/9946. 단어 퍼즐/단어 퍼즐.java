import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 1;
        
        while (true) {
            String origin = br.readLine();
            String shuffle = br.readLine();
            
            if (origin.equals("END") && shuffle.equals("END")) {
                break;
            }
            
            char[] oriArr = origin.toCharArray();
            char[] shfArr = shuffle.toCharArray();

            Arrays.sort(oriArr);
            Arrays.sort(shfArr);

            String sortedOri = new String(oriArr);
            String sortedShf = new String(shfArr);
            
            if (sortedOri.equals(sortedShf)) {
                System.out.println("Case " + tc + ": same");
            } else {
                System.out.println("Case " + tc + ": different");
            }
            
            tc++;
        }
    }
}