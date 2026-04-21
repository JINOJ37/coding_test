import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i : scoville){
            q.add(i);
        }
        
        int trial = 0;
        
        while(q.peek() < K){
            if(trial == scoville.length-1){
                trial = -1;
                break;
            }
            int newData = q.poll() + q.poll()*2;
            q.add(newData);
            trial++;
        }
        
        return trial;
    }
}