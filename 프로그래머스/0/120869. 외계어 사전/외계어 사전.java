class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String d : dic){
            if(d.length() == spell.length){
                for(String s : spell){
                    d = d.replaceFirst(s, "");
                }
                if(d.length() == 0) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}