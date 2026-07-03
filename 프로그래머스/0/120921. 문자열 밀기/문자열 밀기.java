class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int len = A.length();
        
        for(int i=0; i<len; i++){
            if(A.equals(B)) return answer+i+1;
            StringBuilder sb = new StringBuilder(A.substring(0, len-1));
            A = sb.insert(0, A.charAt(len-1)).toString();
        }
        
        return answer;
    }
}