class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = make10(bin1);
        int num2 = make10(bin2);
        int num = num1+num2;
        
        if (num == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        
        while(num > 0){
            sb.append(num % 2);
            num /= 2;
        }
        
        return sb.reverse().toString();
    }
    
    public int make10(String bin){
        int num = 0;
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i) == '1') num += Math.pow(2, bin.length()-i-1);
        }
        return num;
    }
}