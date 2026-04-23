import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String aStn = br.readLine();
        String bStn = br.readLine();

        if (aStn.equals(bStn)) System.out.println("0");
        else System.out.println("1550");
    }
}