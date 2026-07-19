import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }
        
        int count = 0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            boolean hasHigher = queue.stream().anyMatch(d -> d[1] > cur[1]);
            if (hasHigher) {
                queue.offer(cur);
            } else {
                count++;
                if (cur[0] == location) return count;
            }
        }
        return count;
    }
}