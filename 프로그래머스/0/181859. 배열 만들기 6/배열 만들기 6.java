import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int i=0;
        ArrayList<Integer> stk = new ArrayList<>();
        while(true){
            if(i>=arr.length) break;
            if(stk.size() == 0) stk.add(arr[i]);
            else if(stk.get(stk.size()-1) == arr[i]) stk.remove(stk.size()-1);
            else if(stk.get(stk.size()-1) != arr[i]) stk.add(arr[i]);
            i++;
        }
        if(stk.size() == 0) return new int[]{-1};
        return stk.stream().mapToInt(j->j).toArray();
    }
}