package be.pxl.services.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Notification {
    private Long id;
    private String from;
    private String to;
    private String message;
    private String subject;
}
