class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] s = quiz[i].split(" ");
            int X = Integer.parseInt(s[0]);
            int Y = Integer.parseInt(s[2]);
            int Z = Integer.parseInt(s[4]);
            if((s[1].equals("+") && X+Y == Z) || (s[1].equals("-") && X-Y == Z)) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
}