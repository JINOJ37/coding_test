import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = l ; i<=r; i++){
            char[] nums = Integer.toString(i).toCharArray();
            boolean check = true;
            for(char num : nums){
                if(!(num == '5' || num == '0')){
                    check = false;
                    break;
                }
            }
            if(check) list.add(i);
        }
        if(list.size()==0) list.add(-1);
        return list.stream().mapToInt(i->i).toArray();
    }
}