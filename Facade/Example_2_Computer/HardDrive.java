package Facade.Example_2_Computer;

public class HardDrive {
    private String description;

    public HardDrive(String description) {
        this.description = description;
    }

    public void read() {
        System.out.println(description + " Hard Drive is Working!");
    }
}
