class Solution {
    public String solution(String polynomial) {
        String[] string_array = polynomial.split(" ");
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int c = 0;
        for(String s : string_array){
            if(s.equals("+")) continue;
            if(s.contains("x"))
                x += s.length() == 1 ? 1 : Integer.parseInt(s.substring(0, s.length()-1));
            else c += Integer.parseInt(s);
        }
        if(x == 0) sb.append(c);
        else if(c == 0) {
            if(x != 1) sb.append(x);
            sb.append("x");
        } else{
            if(x != 1) sb.append(x);
            sb.append("x + ");
            sb.append(c);
        }
        
        return sb.toString();
    }
}