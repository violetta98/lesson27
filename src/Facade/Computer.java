package Facade;

/**
 * Created by Hillel9 on 24.08.2017.
 */

// Facade
public class Computer {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(123l, hardDrive.read(76,98));
        cpu.jump(670);
        cpu.execute();
    }

}
