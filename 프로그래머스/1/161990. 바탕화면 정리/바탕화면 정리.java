class Solution {
    public int[] solution(String[] wallpaper) {
        int x_len = wallpaper.length;
        int y_len = wallpaper[0].length();
        int lux = -1, luy = y_len, rdx = 0, rdy = 0;
        
        for(int x=0; x<x_len; x++){
            for(int y=0; y<y_len; y++){
                if(wallpaper[x].charAt(y) == '#'){
                    if(lux == -1) lux = x;
                    luy = Math.min(luy, y);
                    rdx = Math.max(rdx, x+1);
                    rdy = Math.max(rdy, y+1);
                }
            }
        } 
        
        int[] answer = {lux, luy, rdx, rdy};
        return answer;
    }
}