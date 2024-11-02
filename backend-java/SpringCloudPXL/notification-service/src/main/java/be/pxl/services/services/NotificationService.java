package be.pxl.services.services;

import be.pxl.services.domain.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {


    public void sendMessage(Notification notification) {
        System.out.println(notification.getMessage());

    }
}
