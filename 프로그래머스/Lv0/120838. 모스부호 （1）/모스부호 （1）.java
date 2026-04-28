import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", 
            "--.", "....", "..", ".---", "-.-", ".-..", 
            "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."
        };
        
        String result = "";
        for (String code : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(code)) {
                    result += (char)('a' + i);
                    break;
                }
            }
        }
        return result;
    }
}