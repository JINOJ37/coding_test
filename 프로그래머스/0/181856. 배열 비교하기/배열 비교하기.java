class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        if(len1 == len2){
            int sum1 = 0, sum2 = 0;
            for(int n1 : arr1) sum1 += n1;
            for(int n2 : arr2) sum2 += n2;
            return (sum1 == sum2) ? 0 : (sum1 > sum2) ? 1 : -1;
        }
        return (len1 > len2) ? 1 : -1;
    }
}