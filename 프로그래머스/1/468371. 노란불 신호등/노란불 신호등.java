class Solution {
    public int solution(int[][] signals) {
        int time = 1;
        int maxCycle = 1;
        
        for(int[] s : signals){
            int thisCycle = s[0]+s[1]+s[2];
            maxCycle = lcm(maxCycle, thisCycle);
        }
        
        while(time < maxCycle){
            boolean allYellow = true;
            
            for(int[] s : signals){
                int pos = time % (s[0]+s[1]+s[2]);
                
                if(!(s[0] < pos && pos <= s[0]+s[1])) {
                    allYellow = false;
                    break;
                }
            }
            
            if(allYellow) return time;
            time++;
        }
        
        return -1;
    }
    
    public int gcd(int a, int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public int lcm(int a, int b){
        return (a*b) / gcd(a, b);
    }
}