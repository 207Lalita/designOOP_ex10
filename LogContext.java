public class LogContext {
    private Logger logger;

    public void setLogger(Logger logger){
        this.logger = logger;
    }

    public void logMessage(String message, LogLevel loglevel){
        if(loglevel == LogLevel.ERROR){
            setLogger(new ErrorLogger());
            logger.logMessage(message);
        }
        else if(loglevel == LogLevel.DEBUG){
            setLogger(new FileLogger());
            logger.logMessage(message);
            setLogger(new ConsoleLogger());
            logger.logMessage(message);
        }
        else if(loglevel == LogLevel.INFO){
            setLogger(new ConsoleLogger());
            logger.logMessage(message);
        }
    }

}
