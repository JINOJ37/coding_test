import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int num : numlist){
            if(num % n == 0) array.add(num);
        }
        return array.stream().mapToInt(i->i).toArray();
    }
}