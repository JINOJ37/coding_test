import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String phone_num : phone_book){
            map.put(phone_num, 1);
        }
        
        for(String phone_num : phone_book){
            for(int i = 0; i<phone_num.length(); i++){
                String temp = phone_num.substring(0,i);
                if(map.containsKey(temp)){
                    return false;
                }
            }
        }
        return true;
    }
}