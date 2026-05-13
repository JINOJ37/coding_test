import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for(int[] inteval : intervals){
            for(int i=inteval[0]; i<=inteval[1]; i++){
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}