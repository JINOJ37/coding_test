class Solution {
    public String solution(int[] numbers, String hand) {
        boolean isRightHand = (hand.equals("right")) ? true : false;
        StringBuilder sb = new StringBuilder();
        int leftPos = 10, rightPos = 12;
        
        for(int num : numbers){
            boolean isRight = true;
            
            if(num == 1 || num == 4 || num == 7){
                isRight = false;
            } else if(num == 3 || num == 6 || num == 9){
                isRight = true;
            } else {
                if(num == 0) num = 11;
                int leftDif = 0, rightDif = 0;
                
                if(leftPos % 3 == 1){
                    leftDif = (Math.abs((num-1) - leftPos) / 3) + 1;
                } else{
                    leftDif = Math.abs(num - leftPos) / 3;
                }
                
                if(rightPos % 3 == 0){
                    rightDif = (Math.abs((num+1) - rightPos) / 3) + 1;
                } else{
                    rightDif = Math.abs(num - rightPos) / 3;
                }
                
                if((rightDif == leftDif && !isRightHand) || rightDif > leftDif){
                    isRight = false;
            }
            }
            
            if(isRight){
                sb.append("R");
                rightPos = num;
            } else{
                sb.append("L");
                leftPos = num;
            }
        }
    
        return sb.toString();
    }
}