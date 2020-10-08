package Facade.Example_1_HomeTheater;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("DVD Player", amp);
        CdPlayer cd = new CdPlayer("CD Player", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", player);
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights,
                popcornPopper);

        homeTheater.watchMovie("Paris, Texas");
        homeTheater.endMovie();
    }
}
