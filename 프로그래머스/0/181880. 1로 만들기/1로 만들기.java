class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        for(int num : num_list){
            while(true){
                if(num == 1) break;
                if(num%2 == 1) num = (num-1)/2;
                else num/=2;
                count++;
            }
        }
        return count;
    }
}