package Command.Example_2_WithLambda;

public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo is On");
    }

    public void off() {
        System.out.println(location + " Stereo is Off");
    }

    public void setCd() {
        System.out.println(location + " Stereo is set for CD");
    }

    public void setDvd() {
        System.out.println(location + " Stereo is set for DVD");
    }

    public void setRadio() {
        System.out.println(location + " Stereo is set for Radio");
    }

    public void SetVolume(int volume) {
        System.out.println(location + " Stereo volume set to " + volume);
    }
}
