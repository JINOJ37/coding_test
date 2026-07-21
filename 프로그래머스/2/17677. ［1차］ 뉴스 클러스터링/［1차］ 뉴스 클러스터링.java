import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        HashMap<String, Integer> map = new HashMap<>();
        int str1count = 0, str2count = 0, samecount = 0;
        
        for(int i=0; i<str1.length()-1; i++){
            String word = str1.substring(i, i+2).toLowerCase();
            if(!word.matches("[a-z]+")) continue;
            map.merge(word, 1, Integer::sum);
            str1count++;
        }
        
        for(int i=0; i<str2.length()-1; i++){
            String word = str2.substring(i, i+2).toLowerCase();
            if(!word.matches("[a-z]+")) continue;
            if(map.containsKey(word) && map.get(word) > 0){
                samecount++;
                map.put(word, map.get(word)-1);
            }
            str2count++;
        }
        
        double same = 1.0;
        if(str1count != 0 || str2count != 0) {
            same = (double) samecount / (str1count + str2count - samecount);
        }
        return (int)(same*65536);
    }
}