import java.util.HashMap;
class Solution {
    public int solution(String[] order) {
        HashMap<String, Integer> coffee = new HashMap<>();
        coffee.put("iceamericano", 4500);
        coffee.put("americanoice", 4500);
        coffee.put("hotamericano", 4500);
        coffee.put("americanohot", 4500);
        coffee.put("americano", 4500);
        coffee.put("anything", 4500);
        coffee.put("icecafelatte", 5000);
        coffee.put("cafelatteice", 5000);
        coffee.put("hotcafelatte", 5000);
        coffee.put("cafelattehot", 5000);
        coffee.put("cafelatte", 5000);
        
        int sum = 0;
        for(String o : order){
            sum += coffee.get(o);
        }
        return sum;
    }
}