package Facade.Example_2_Computer;

public class ComputerFacade {

    Cpu processor;
    Memory ram;
    HardDrive hd;

    public ComputerFacade(Cpu processor, Memory ram, HardDrive hd) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
    }

    public void start() {
        processor.freeze();
        hd.read();
        ram.load("0x20000", 4096);
        processor.execute();
        System.out.println("PC is turning on...");
    }
}
