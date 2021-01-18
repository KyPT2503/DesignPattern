package designPattern.structural.DI;

import designPattern.structural.DI.MessageService;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    List<MessageService> messageServices = new ArrayList<>();

    public User(String name, List<MessageService> messageServices) {
        this.name = name;
        this.messageServices = messageServices;
    }

    public void addMessageService(MessageService messageService) {
        this.messageServices.add(messageService);
    }

    public void sendMessage(String message) {
        for (MessageService messageService : this.messageServices) {
            messageService.sendMessage(message);
        }
    }
}
