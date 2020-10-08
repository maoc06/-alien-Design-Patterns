package Facade.Example_2_Computer;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Cpu processor = new Cpu("AMD Ryzen 9");
        Memory ram = new Memory("Corsair Vengeance");
        HardDrive hd = new HardDrive("Seagate BarraCuda");

        ComputerFacade pc = new ComputerFacade(processor, ram, hd);
        pc.start();
    }
}
