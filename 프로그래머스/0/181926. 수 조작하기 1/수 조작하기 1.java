class Solution {
    public int solution(int n, String control) {
        char[] char_control = control.toCharArray();
        
        for(char c : char_control){
            switch(c){
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n+=10;
                    break;
                case 'a':
                    n-=10;
                    break;
            }
        }
        return n;
    }
}