import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            if(list.size() == 0 || list.get(list.size()-1) != num)
                list.add(num);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}