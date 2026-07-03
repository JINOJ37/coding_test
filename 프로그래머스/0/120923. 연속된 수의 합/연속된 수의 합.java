import java.util.ArrayList;
class Solution {
    public int[] solution(int num, int total) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int startNum = (num%2==1) ? total/num - num/2 : total/num - num/2 + 1;
        
        for(int i=startNum ; i<startNum+num ; i++){
            list.add(i);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}