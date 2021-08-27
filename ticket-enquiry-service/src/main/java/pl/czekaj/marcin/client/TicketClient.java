package pl.czekaj.marcin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.czekaj.marcin.dto.TicketEnquiryDto;

@FeignClient(name="ticket-service")
public interface TicketClient {

    @GetMapping("/check-ticket/movieName/{movieName}")
    TicketEnquiryDto checkTicket(@PathVariable String movieName);

}
