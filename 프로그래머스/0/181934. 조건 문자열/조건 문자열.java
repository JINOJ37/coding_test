class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int condition = 0;
        if(ineq.equals(">")){
            if(eq.equals("=") && n>=m){
                condition = 1;
            } else if(eq.equals("!") && n>m){
                condition = 1;
            }
        } else if(ineq.equals("<")){
            if(eq.equals("=") && n<=m){
                condition = 1;
            } else if(eq.equals("!") && n<m){
                condition = 1;
            }
        }
        return condition;
    }
}