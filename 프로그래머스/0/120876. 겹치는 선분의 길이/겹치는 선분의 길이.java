class Solution {
    public int solution(int[][] lines) {
        int[] check = new int[201];
        int answer = 0;
        
        for(int[] line : lines){
            for(int i=line[0] ; i<line[1]; i++)
                check[i+100]++;
        }
        
        for(int i=0; i<201; i++){
            if(check[i]>=2) {
                answer++;
            }
        }
        
        return answer;
    }
}