public class ConsoleLogger implements Logger {
    public void logMessage(String message){
        System.out.println("Standard Console::Logger "+message);
    }
    
}