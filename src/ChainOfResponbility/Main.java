package ChainOfResponbility;

/**
 * Created by Hillel9 on 24.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        Logger logger, logger1, logger2;
        // build the chain of responsibility
        logger = new StderrLogger(Logger.DEBUG);
        logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(Logger.ERR));
        // handled StdoutLogger
        logger.message("Entering function y.", Logger.DEBUG);

        logger.message("Step1 completed.", Logger.NOTICE);

        logger.message("An error has ocurred.", Logger.ERR);

    }

}
