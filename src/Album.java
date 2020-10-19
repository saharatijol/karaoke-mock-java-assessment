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
    public void printTrackListings() {
        System.out.println();
    }
}