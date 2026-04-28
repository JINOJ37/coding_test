import java.util.*;

class Solution {
    
    static class Song implements Comparable<Song> {
        int id;
        int play;
        
        public Song(int id, int play) {
            this.id = id;
            this.play = play;
        }
        
        @Override
        public int compareTo(Song other) {
            if (this.play == other.play) {
                return this.id - other.id;
            }
            return other.play - this.play;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genreTotalPlay = new HashMap<>();
        HashMap<String, ArrayList<Song>> genreSongs = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            genreTotalPlay.put(genres[i], genreTotalPlay.getOrDefault(genres[i], 0)+plays[i]);
            if (!genreSongs.containsKey(genres[i])) {
                genreSongs.put(genres[i], new ArrayList<>());
            }
            genreSongs.get(genres[i]).add(new Song(i, plays[i]));
        }
        
        ArrayList<String> sortedGenres = new ArrayList<>(genreTotalPlay.keySet());
        sortedGenres.sort((g1, g2) -> genreTotalPlay.get(g2) - genreTotalPlay.get(g1));
        
        ArrayList<Integer> bestAlbum = new ArrayList<>();
        
        for(String genre : sortedGenres){
            ArrayList<Song> songs = genreSongs.get(genre);
            
            Collections.sort(songs);
            
            bestAlbum.add(songs.get(0).id);
            
            if (songs.size() > 1) {
                bestAlbum.add(songs.get(1).id);
            }
        }
            
        return bestAlbum.stream().mapToInt(i -> i).toArray();
        
    }
}