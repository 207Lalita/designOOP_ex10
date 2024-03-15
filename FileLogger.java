public class FileLogger implements Logger {
    public void logMessage(String message){
        System.out.println("File::Logger "+message);
    }
}
