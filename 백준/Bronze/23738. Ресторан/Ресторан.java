import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // 러시아어 특수 문자에 따른 영어 변환
            switch (c) {
                case 'B': sb.append("v"); break;
                case 'E': sb.append("ye"); break;
                case 'H': sb.append("n"); break;
                case 'P': sb.append("r"); break;
                case 'C': sb.append("s"); break;
                case 'Y': sb.append("u"); break;
                case 'X': sb.append("h"); break;
                default: 
                    sb.append(String.valueOf(c).toLowerCase());
                    break;
            }
        }

        System.out.println(sb);
    }
}