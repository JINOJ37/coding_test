class Solution {
    public int solution(int[] num_list) {
        int resultA = 1;
        int resultB = 0;
        for(int num : num_list){
            resultA *= num;
            resultB += num;
        }
        return resultA < resultB*resultB ? 1 : 0;
    }
}