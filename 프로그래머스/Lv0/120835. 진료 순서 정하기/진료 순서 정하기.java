import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {        
        List<Integer> sorted = Arrays.stream(emergency)           
                                    .boxed()
                                    .sorted(Collections.reverseOrder()) 
                                    .collect(Collectors.toList());
            
        return Arrays.stream(emergency)
                    .map(e -> sorted.indexOf(e) + 1)
                    .toArray();
    }
}