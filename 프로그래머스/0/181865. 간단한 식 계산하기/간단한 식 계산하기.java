class Solution {
    public int solution(String binomial) {
        String[] x = binomial.split(" ", 3);
        switch(x[1]){
            case "+": return Integer.parseInt(x[0]) + Integer.parseInt(x[2]);
            case "-": return Integer.parseInt(x[0]) - Integer.parseInt(x[2]);
            case "*": return Integer.parseInt(x[0]) * Integer.parseInt(x[2]);
        }
        return 0;
    }
}