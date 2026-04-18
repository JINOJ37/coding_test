import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        
        for(int num : nums){
            map.add(num);
        }
        
        int result = (nums.length/2 < map.size()) ? nums.length/2 : map.size();
        
        return result;
    }
}