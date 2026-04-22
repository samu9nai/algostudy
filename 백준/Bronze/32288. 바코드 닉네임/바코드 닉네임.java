import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'I') arr[i] = 'i';
            if (arr[i] == 'l') arr[i] = 'L';
        }
        System.out.println(new String(arr));
    }
}