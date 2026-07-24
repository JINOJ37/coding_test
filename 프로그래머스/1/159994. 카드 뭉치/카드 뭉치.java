class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0, i2 = 0, i = 0;
        while(i < goal.length){
            if(i1 < cards1.length && goal[i].equals(cards1[i1])) {
                i++; i1++;
            } else if(i2 < cards2.length && goal[i].equals(cards2[i2])){
                i++; i2++;
            } else return "No";
        }
        
        return "Yes";
    }
}