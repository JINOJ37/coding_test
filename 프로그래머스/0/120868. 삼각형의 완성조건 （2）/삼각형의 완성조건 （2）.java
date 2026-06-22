import java.util.HashSet;

class Solution {
    public int solution(int[] sides) {
        int long_side = sides[0] > sides[1] ? sides[0] : sides[1];
        int short_side = sides[0] < sides[1] ? sides[0] : sides[1];
        HashSet<Integer> set = new HashSet<>();
        for(int i=long_side; i<sides[0]+sides[1]; i++){
            set.add(i);
        }
        for(int i=long_side; i+short_side > long_side; i--){
            set.add(i);
        }
        
        return set.size();
    }
}