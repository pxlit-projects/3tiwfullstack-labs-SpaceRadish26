package be.pxl.services.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
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
