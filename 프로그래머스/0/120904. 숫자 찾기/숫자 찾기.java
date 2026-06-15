class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int index = 1;
        while(num > 0){
            if(num % 10 == k) answer = index;
            num /= 10;
            index++;
        }
        System.out.println(answer);
        System.out.println(index);
        return answer == -1 ? -1 : index - answer;
    }
}