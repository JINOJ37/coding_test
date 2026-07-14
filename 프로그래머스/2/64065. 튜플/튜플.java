import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] array = s.substring(2, s.length()-2).split("\\},\\{");
        Arrays.sort(array, (a,b) -> Integer.compare(a.length(), b.length()));
        
        List<Integer> list = new ArrayList<>();
        for(String a : array){
            String[] arr = a.split(",");
            for(String n : arr){
                int num = Integer.parseInt(n);
                if(!list.contains(num)) {
                    list.add(num);
                    break;
                }
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}