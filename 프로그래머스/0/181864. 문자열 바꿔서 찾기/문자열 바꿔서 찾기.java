class Solution {
    public int solution(String myString, String pat) {
        String temp1 = myString.replaceAll("A", "C");
        String temp2 = temp1.replaceAll("B", "A");
        String result = temp2.replaceAll("C", "B");
        if(result.contains(pat)) return 1;
        return 0;
    }
}