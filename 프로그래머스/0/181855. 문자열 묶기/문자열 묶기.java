import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(String s : strArr){
            map.put(s.length(), map.getOrDefault(s.length(), 0)+1);
        }
        return Collections.max(map.values());
    }
}