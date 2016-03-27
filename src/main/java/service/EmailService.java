package service;

public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email message has been sent: " + message);
    }
}
