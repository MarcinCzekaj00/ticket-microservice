package pl.czekaj.marcin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class TicketDto {

    private String id;
    private String movieName;
    private BigDecimal ticketPrice;
    private String ticketAvailability;

    private int port;
}
