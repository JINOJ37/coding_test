import java.util.HashSet;
class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int i=2;
            for(i=2; i<n; i++){
                if(n%i == 0) {
                    n /= i;
                    set.add(i);
                    break;
                }
            }
            if(i == n){
                set.add(n);
                break;
            }
        }
        return set.stream().sorted().mapToInt(i->i).toArray();
    }
}