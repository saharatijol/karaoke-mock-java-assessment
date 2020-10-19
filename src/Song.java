import java.util.Arrays;
import java.util.List;

public class Song {
    private String title;
    private String artist;
    private List<String> lyrics;

    // Constructor
    public Song (String title, String artist, List<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public List<String> getLyrics() {
        return this.lyrics;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }

    // parseLyrics
    public static List<String> parseLyrics(String words) {
        return Arrays.asList(words.split(" "));
    }

    // test
    public static void main(String[] args) {
        System.out.println(parseLyrics("It's not that i don't want you here. It's something bout the way you stare into my eyes. I know that I don't make things clear(noo..) I fall for you everytime i try to resist you"));
    }
}

