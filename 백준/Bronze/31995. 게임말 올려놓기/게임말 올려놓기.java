import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(br.readLine());
		int h = Integer.parseInt(br.readLine());
		
		if (w == 1 || h == 1) {
			System.out.println(0);
		} else {
            System.out.println(2 * (h - 1) * (w - 1));
		}
    }
}