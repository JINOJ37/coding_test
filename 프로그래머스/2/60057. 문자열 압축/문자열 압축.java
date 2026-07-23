class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i=1; i<=s.length()/2; i++){
            StringBuilder sb = new StringBuilder();
            String lastword = s.substring(0, i);
            int count = 1;
            
            for(int j=i; j<s.length(); j+=i){
                int end = Math.min(j + i, s.length());
                String thisword = s.substring(j, end);
                
                if(lastword.equals(thisword)){
                    count++;
                } else{
                    if(count > 1) sb.append(count);
                    sb.append(lastword);
                    
                    count = 1;
                    lastword = thisword;
                }
            }
            
            if(count > 1) sb.append(count);
            sb.append(lastword);
            
            answer = Math.min(answer, sb.length());
        }
        
        return answer;
    }
}