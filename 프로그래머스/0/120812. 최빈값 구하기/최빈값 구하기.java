import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int max_count = 0;
        int count = 0;
        int answer = -1;
        for(int i=0; i<array.length; i++){
            count++;
            if(i == array.length-1 || (i != array.length-1 && array[i] != array[i+1])) {
                if(max_count == count) answer = -1;
                else if(max_count < count){
                    max_count = count;
                    System.out.println(max_count);
                    answer = array[i];
                }
                count = 0;
            } else{
                count++;
            }
        }
        return answer;
    }
}