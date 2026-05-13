import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        switch(n){
            case 1: return Arrays.stream(num_list, 0, slicer[1]+1).toArray(); 
            case 2: return Arrays.stream(num_list, slicer[0], num_list.length).toArray(); 
            case 3: return Arrays.stream(num_list, slicer[0], slicer[1]+1).toArray();
            case 4: 
                for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
                    list.add(num_list[i]);
                }
                return list.stream().mapToInt(i->i).toArray();
        }
        return new int[0];
    }
}