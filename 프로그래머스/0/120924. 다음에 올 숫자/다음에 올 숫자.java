class Solution {
    public int solution(int[] common) {
        int temp = 0;
        boolean checkPlus = true;
        if(common[1] * 2 == common[0]+common[2]) temp = common[1]-common[0];
        else {
            temp = common[1]/common[0];
            checkPlus = false;
        }
        
        return checkPlus ? common[common.length-1]+temp : common[common.length-1]*temp;
    }
}