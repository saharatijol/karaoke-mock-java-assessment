import java.util.Arrays;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    // Constructors
    public Album (String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    // Setters
    public void setName() {
        this.name = name;
    }

    public void setSongs() {
        this.songs = songs;
    }

    // Print tracks
    public static void printTrackListings() {
//        for (Song song : songs) {
//            System.out.println(songs.getTitle());
//        }
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(i++ + ". " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist());
        }
    }

    // test
    public static void main(String[] args) {
        Album a = new Album("90s Hits", Arrays.asList(
           new Song("Every Day is a Winding Road", "Sheryl Crow", Song.parseLyrics("Everyday is a winding road ... I get a little bit closer to feeling fine")),
           new Song("Ready to Go", "Republica", Song.parseLyrics("I'm standing on the rooftops shouting out, Baby, I'm ready to go")),
           new Song("Airbag", "Radiohead", Song.parseLyrics("In an interstellar burst I am back to save the universe"))
        ));

        printTrackListings();
    }

}