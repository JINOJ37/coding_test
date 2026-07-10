class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        
        for(char c : s.toCharArray()){
            int num = c - '0';
            if(num < 0 || 9 < num) return false;
        }
        
        return true;
    }
}