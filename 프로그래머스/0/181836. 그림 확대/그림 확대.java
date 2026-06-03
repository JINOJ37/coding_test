class Solution {
    public String[] solution(String[] picture, int k) {
        int len = picture[0].length();
        int count = picture.length;
        String[] answer = new String[count*k];
        int index = 0;
        
        for(int i=0; i<count; i++){
            String newPicture = "";
            for(int j=0; j<len; j++){
                for(int x=0; x<k; x++)
                    newPicture += picture[i].charAt(j);
            }
            for(int x=0; x<k; x++)
                answer[index++] = newPicture;
        }
        return answer;
    }
}