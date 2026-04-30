import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (num > k) {
                list.add(num);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}