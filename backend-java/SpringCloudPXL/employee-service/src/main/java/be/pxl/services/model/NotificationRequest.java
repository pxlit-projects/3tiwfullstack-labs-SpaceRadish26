package be.pxl.services.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationRequest {
    private String message;
    private String sender;
}

