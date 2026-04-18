import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        int result = (nums.length/2 < map.size()) ? nums.length/2 : map.size();
        
        return result;
    }
}