package Adapter.Example_3_MediaPlayer;

public class MediaPlayerTestDrive {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Nothing Else Matters.mp3");
        audioPlayer.play("mp4", "Touch Daft Punk.mp4");
        audioPlayer.play("vlc", "Dont Let me be Misundestood.vlc");
        audioPlayer.play("avi", "This Magic Moment.avi");
    }
}
