import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> delete_set = new HashSet<>();
        for(int d : delete_list){
            delete_set.add(d);
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int a : arr){
            if(!delete_set.contains(a)) answer.add(a);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}