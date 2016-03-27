package service;

public class APNservice implements MessageService {
    public void sendMessage(String message) {
        System.out.println("APN message has been sent: " + message);
    }
}
