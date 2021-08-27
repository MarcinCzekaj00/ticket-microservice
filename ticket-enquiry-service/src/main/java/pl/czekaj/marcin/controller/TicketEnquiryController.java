package pl.czekaj.marcin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.czekaj.marcin.client.TicketClient;
import pl.czekaj.marcin.dto.TicketEnquiryDto;

@RestController
public class TicketEnquiryController {

    @Autowired
    TicketClient client;

    @GetMapping("/ticket-enquiry/movieName/{movieName}/unit/{unit}")
    public TicketEnquiryDto getEnquiryOfProduct(@PathVariable String movieName,
                                                @PathVariable int unit){

        TicketEnquiryDto ticketEnquiryDto = client.checkTicket(movieName);

        double totalPrice = ticketEnquiryDto.getTicketPrice().doubleValue()*unit;

        return new TicketEnquiryDto(
                ticketEnquiryDto.getId(),
                movieName,
                ticketEnquiryDto.getTicketPrice(),
                ticketEnquiryDto.getTicketAvailability(),
                unit,
                totalPrice,
                ticketEnquiryDto.getPort()
        );
    }
}
