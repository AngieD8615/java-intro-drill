import java.util.ArrayList;

public class Playlist {
    public String name;
    
    ArrayList<Song> songs = new ArrayList<Song>();

    public Playlist(String name) {
        this.name = name;
    }

    public Boolean isEmpty() {
        return songs.isEmpty();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String[] songNames(){
        int arrayLength = songs.size();
        String[] songArr = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            songArr[i] = songs.get(i).title;
        }
        return songArr;
    }

    public int totalDuration() {
        int arrayLength = songs.size();
        int duration = 0; 
        for (int i = 0; i < arrayLength; i++) {
            duration += songs.get(i).durationInSeconds;
        }
        return duration;
    }

    public void swap(Song songA, Song songB) {
        int indexOfSongA = -1;
        int indexOfSongB = -1;
        for (int i = 0; i < songs.size(); i++) {
            if(songs.get(i).equals(songA)) {
                indexOfSongA = i;
                System.out.println("fired A" + i);
            } else if(songs.get(i).equals(songB)) {
                indexOfSongB = i;
                System.out.println("fired B" + i);
            }
        }
        if (indexOfSongA > -1 && indexOfSongB > -1) {
            songs.set(indexOfSongA, songB);
            songs.set(indexOfSongB, songA);
        }    
    }
    
    public void removeSong(Song song) {
        int indexToRemove = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).equals(song)) {
                songs.remove(i);
            }
        }

    }

}
