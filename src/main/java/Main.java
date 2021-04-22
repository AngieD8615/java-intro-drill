public class Main {
  public static void main(String[] args) {
    Playlist test = new Playlist("test name");
    
    Song everything = new Song("Radiohead", "Everything In Its Right Place", 200);
    Song time = new Song("Pink Floyd", "Time", 408);
    test.addSong(everything);
    test.addSong(time);
    test.songNames();
  }
}
