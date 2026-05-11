class Solution {
    public String solution(String my_string, int m, int c) {
        int len = my_string.length();
        char[][] string = new char[len/m][m];
        for(int i=0; i<len; i++){
            string[i/m][i%m] = my_string.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len/m; i++){
            sb.append(string[i][c-1]);
        }
        return sb.toString();
    }
}