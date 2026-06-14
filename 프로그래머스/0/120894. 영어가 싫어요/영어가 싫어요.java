import java.util.HashMap;
class Solution {
    public long solution(String numbers) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        long answer = 0;
        StringBuilder num = new StringBuilder();
        for(char c : numbers.toCharArray()){
            num.append(c);
            if(map.containsKey(num.toString())) {
                answer = (answer + map.get(num.toString())) * 10;
                num.delete(0, num.length());
            }
        }
        return answer/10;
    }
}