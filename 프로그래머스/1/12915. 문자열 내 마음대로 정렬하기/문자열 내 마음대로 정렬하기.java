import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = Arrays.asList(strings);
        list.sort((a,b) -> (a.charAt(n) == b.charAt(n)) ? a.compareTo(b) : Integer.compare(a.charAt(n), b.charAt(n)));
        return list.toArray(new String[0]);
    }
}