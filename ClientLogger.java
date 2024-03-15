public class ClientLogger {
    public static void main(String[] args) {
        LogContext context = new LogContext();
        context.logMessage("This is an information.",LogLevel.INFO);
        context.logMessage("This is debug information.",LogLevel.DEBUG);
        context.logMessage("This is error information.",LogLevel.ERROR);
    }
}
