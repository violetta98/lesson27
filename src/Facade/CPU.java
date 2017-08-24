package Facade;

/**
 * Created by Hillel9 on 24.08.2017.
 */
public class CPU {

    public void freeze() {
        System.out.println("freeze");
    }

    public void jump(long position) {
        System.out.println(position);
    }

    public void execute() {
        System.out.println("execute");
    }

}
