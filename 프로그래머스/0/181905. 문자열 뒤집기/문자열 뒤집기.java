class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<s; i++){
            result.append(my_string.charAt(i));
        }
        for(int i =e; i>=s; i--){
            result.append(my_string.charAt(i));
        }
        for(int i =e+1; i<my_string.length(); i++){
            result.append(my_string.charAt(i));
        }
        return result.toString();
    }
}