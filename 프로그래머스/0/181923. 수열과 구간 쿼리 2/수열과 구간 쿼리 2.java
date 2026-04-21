class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;
        
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int min = 1000001;
            for(int i = s; i<=e; i++){
                if(arr[i] > k){
                    min = Math.min(min, arr[i]);
                }
            }
            if(min == 1000001)
                min = -1;
            answer[index++] = min;
        }
        return answer;
    }
}