class Solution {
    public int[] solution(String my_string) {
        int[] result = new int[52];
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result[c - 'A']++;
            }
            else if (c >= 'a' && c <= 'z') {
                result[c - 'a' + 26]++;
            }
        }
        return result;
    }
}