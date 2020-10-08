package Facade.Example_2_Computer;

public class Cpu {
    private String description;

    public Cpu(String description) {
        this.description = description;
    }

    public void freeze() {
        System.out.println("Processor it's freeze");
    }

    public void execute() {
        System.out.println(description + " processor executing right!");
    }
}
