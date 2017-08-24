package ChainOfResponbility;

/**
 * Created by Hillel9 on 24.08.2017.
 */
public class StderrLogger extends Logger {

    public StderrLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }

}
