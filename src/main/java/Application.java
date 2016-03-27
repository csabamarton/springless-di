import injector.MessageServiceInjector;
import service.APNservice;
import service.EmailService;

public class Application {

    public static void main(String[] args) {
        MessageServiceInjector messageServiceInjector = new MessageServiceInjector(new EmailService());
        messageServiceInjector.processMessage("Email message");


        messageServiceInjector = new MessageServiceInjector(new APNservice());
        messageServiceInjector.processMessage("APN message");

    }
}
