package pl.czekaj.marcin.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TicketEnquiryDto {

    private String id;
    private String movieName;
    private BigDecimal ticketPrice;
    private String ticketAvailability;

    private int unit;
    private double totalPrice;

    private int port;
}
