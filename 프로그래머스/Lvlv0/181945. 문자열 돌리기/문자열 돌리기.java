import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] str = a.toCharArray();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}