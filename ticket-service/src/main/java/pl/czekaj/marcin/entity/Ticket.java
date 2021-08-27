package pl.czekaj.marcin.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Ticket {

    @Id
    private String id;
    private String movieName;
    private BigDecimal ticketPrice;
    private String ticketAvailability;
}
