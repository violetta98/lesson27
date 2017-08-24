package ChainOfResponbility;

/**
 * Created by Hillel9 on 24.08.2017.
 */
public class EmailLogger extends Logger {

    public EmailLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }

}
