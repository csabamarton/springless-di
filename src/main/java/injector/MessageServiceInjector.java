package injector;

import service.MessageService;

public class MessageServiceInjector implements NotificationProcessor {

    private MessageService messageService;

    public MessageServiceInjector(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
