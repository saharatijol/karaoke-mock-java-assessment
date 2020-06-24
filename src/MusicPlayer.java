import java.io.IOException;
import static java.lang.Thread.sleep;

public class MusicPlayer extends Player {

    private String voice = "";

    public MusicPlayer() {
    }

    public MusicPlayer(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    /**
     * Says all songs on an album
     * @param a an Album instance
     */
    @Override
    public void play(Album a) {
        for (Song s : a.getSongs()) {
            play(s);
        }
    }

    /**
     * Says all lyrics in a song
     * @param s a Song instance
     */
    @Override
    public void play(Song s) {
        Runtime r = Runtime.getRuntime(); // allows commands to be issued to the terminal
        try {
            r.exec("say " + "now playing..." + s.getTitle() + " by " + s.getArtist());
            sleep(INTRO_PAUSE); // pauses thread
            for (String lyric : s.getLyrics()) {
                if (voice.isEmpty()) {
                    r.exec("say " + lyric);
                } else {
                    r.exec("say -v " + voice + " " + lyric);
                }
                sleep(WORD_CADENCE);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
