class Solution {
    public int solution(String s) {
        String[] array = s.split(" ");
        int answer = 0;
        int lastValue = 0;
        for(String c : array){
            if(c.equals("Z")){
                lastValue = 0;
                continue;
            } 
            answer+=lastValue;
            lastValue = Integer.parseInt(c);
        }
        answer+=lastValue;
        return answer;
    }
}