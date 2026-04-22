class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i = 0; i<n; i++){
            if(!visited[i]){
                dfs(n, computers, visited, i);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int n, int[][] computers, boolean[] visited, int current_num){
        visited[current_num] = true;
        
        for(int i=0; i<n; i++){
            if(i == current_num || computers[current_num][i] == 0 || visited[i]) continue;
            dfs(n, computers, visited, i);
        }
    }
}