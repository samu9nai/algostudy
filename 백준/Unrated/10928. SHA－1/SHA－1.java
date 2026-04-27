import java.io.*;
import java.security.*;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(str.getBytes());
        
        for(byte b: md.digest()) {
            sb.append(String.format("%02x", b));
        }

        System.out.println(sb);

    }

}