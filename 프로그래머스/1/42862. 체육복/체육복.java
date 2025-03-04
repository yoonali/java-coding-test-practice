import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>(), reserveSet = new HashSet<>();
        
        for (int r : reserve) reserveSet.add(r);
        for (int l : lost) {
            if (!reserveSet.remove(l)) lostSet.add(l);
        }
        
        for (int r : new TreeSet<>(reserveSet)) {
            if (lostSet.remove(r - 1) || lostSet.remove(r + 1)) {
                reserveSet.remove(r);
            }
        }
        
        return n - lostSet.size();
    }
}