class Solution {
    public int[] solution(int[] numlist, int n) {
        int abs_count = n<5000 ? 10001-n : n+1;
        int[] gap = new int[abs_count];
        
        for(int num : numlist){
            int index = Math.abs(num-n);
            gap[index] = gap[index]!=0 ? 3 : (num>n ? 1 : 2); 
            // 1양수,2음수,3둘다
        }
        
        int[] answer = new int[numlist.length];
        int answer_index = 0;
        
        for(int i=0; i<gap.length; i++){
            if(gap[i] == 0) continue;
            else if(gap[i] == 3){
                answer[answer_index++] = n+i;
                answer[answer_index++] = n-i;
            } else if(gap[i] == 1) answer[answer_index++] = n+i;
            else if(gap[i] == 2) answer[answer_index++] = n-i;
        }
        return answer;
    }
}