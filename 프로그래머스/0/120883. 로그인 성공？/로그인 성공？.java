import java.util.Arrays;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] info : db){
            if(Arrays.equals(id_pw, info)) return "login";
            if(info[0].equals(id_pw[0])) return "wrong pw";
        }
        return "fail";
    }
}