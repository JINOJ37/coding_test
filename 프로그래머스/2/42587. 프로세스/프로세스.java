import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int len = priorities.length;
        int[] order = new int[len];
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            order[i] = priorities[i];
        }
        Arrays.sort(order);
        int pos = 0, index = 0;
        
        while(index < len){
            if(priorities[pos] == order[order.length - 1 - index]){
                answer[index] = pos;
                index++;
            }
            pos = (pos+1) % len;
        }
        
        for(int i=0; i<index; i++){
            if(answer[i] == location) return i+1;
        }
        
        return 0;
    }
}