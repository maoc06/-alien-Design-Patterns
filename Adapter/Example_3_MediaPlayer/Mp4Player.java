package Adapter.Example_3_MediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // Nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}
