package Facade.Example_2_Computer;

public class Memory {
    private String description;

    public Memory(String description) {
        this.description = description;
    }

    public void load(String position, int data) {
        System.out.println(description + " processor running at " + position + ", with size of " + data);
    }
}
