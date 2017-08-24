package ChainOfResponbility;

/**
 * Created by Hillel9 on 24.08.2017.
 */
public abstract class Logger {

    public static final int ERR = 3;
    public static final int NOTICE = 5;
    public static final int DEBUG = 7;
    protected int mask;

    // the next element in the chain of responsibity
    protected Logger next;

    public Logger setNext(Logger logger) {
        this.next = logger;
        return logger;
    }

    public void message(String msg, int priority) {
        if (priority <= this.mask)
            writeMessage(msg);
        if (next != null)
            next.message(msg, priority);
    }

    abstract protected void writeMessage(String msg);

}
