class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int index = 0;
        while(true){
            int newIndex = myString.indexOf(pat, index);
            if(newIndex == -1) break;
            else index = newIndex+1;
            count++;
        }
        return count;
    }
}