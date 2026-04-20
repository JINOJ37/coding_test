class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for(int idx = 0; idx<code.length(); idx++){
            char x = code.charAt(idx);
            if(mode == 0){
                if(x != '1' && idx%2 == 0){
                    ret.append(x);
                } else if(x == '1'){
                    mode = 1;
                }
            } else if(mode == 1){
                if(x != '1' && idx%2 == 1){
                    ret.append(x);
                } else if(x == '1'){
                    mode = 0;
                }
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}