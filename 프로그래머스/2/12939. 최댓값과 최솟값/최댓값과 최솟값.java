import java.util.*;

class Solution {
    public String solution(String s) {
        int[] nums = Arrays.stream(s.split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        int min = Arrays.stream(nums).min().orElseThrow();
        int max = Arrays.stream(nums).max().orElseThrow();
        
        return min + " " + max;
    }
}