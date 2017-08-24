package ChainOfResponbility;

/**
 * Created by Hillel9 on 24.08.2017.
 */
public class StdoutLogger extends Logger {

    public StdoutLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }

}
