import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> s.length() - s.replace(String.valueOf(c), "").length() == 1)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}