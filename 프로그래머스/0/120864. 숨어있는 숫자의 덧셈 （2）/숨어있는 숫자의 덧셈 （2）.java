class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int temp = 0;
        for(char c : my_string.toCharArray()){
            int num = (int)(c-'0');
            if(0<=num && num<10){
                if(temp != 0) temp = temp*10 + num;
                else temp += num;
            } else{
                answer+=temp;
                temp = 0;
            }
        }
        answer += temp;
        return answer;
    }
}