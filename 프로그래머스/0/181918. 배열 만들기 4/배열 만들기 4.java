import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length){
            int len = stk.size();
            if(len == 0) stk.add(arr[i++]);
            else if(stk.get(len-1) < arr[i]) stk.add(arr[i++]);
            else stk.remove(len-1);
        }
        
        return stk.stream().mapToInt(j->j).toArray();
    }
}