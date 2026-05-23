class Solution {
    public int solution(int[] arr) {
        int count = 0;
        while(true){
            boolean checkChange = false;
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i]%2 == 0) {
                    arr[i] /= 2;
                    checkChange = true;
                }
                else if(arr[i] < 50 && arr[i]%2 == 1) {
                    arr[i] = arr[i]*2+1;
                    checkChange = true;
                }
            }
            if(!checkChange) break;
            count ++;
        }
        
        return count;
    }
}