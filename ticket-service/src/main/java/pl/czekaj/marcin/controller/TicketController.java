package pl.czekaj.marcin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.czekaj.marcin.dto.TicketDto;
import pl.czekaj.marcin.entity.Ticket;
import pl.czekaj.marcin.repository.TicketRepository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class TicketController {

    private final TicketRepository repository;
    private final ServerProperties serverProperties;

    @GetMapping("/check-ticket/movieName/{movieName}")
    public ResponseEntity<TicketDto> checkTicket(@PathVariable String movieName){

        Ticket ticket = repository.findByMovieName(movieName);

        if(ticket == null){
            //exception handling
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(new TicketDto(
                                    ticket.getId(),
                                    ticket.getMovieName(),
                                    ticket.getTicketPrice(),
                                    ticket.getTicketAvailability(),
                                    serverProperties.getPort()), HttpStatus.OK);
    }

    @PostConstruct
    private void fill(){
        repository.save(new Ticket("1","horror",BigDecimal.valueOf(20),"yes"));
        repository.save(new Ticket("2","musical",BigDecimal.valueOf(10),"no"));
        repository.save(new Ticket("3","drama",BigDecimal.valueOf(15),"yes"));

    }
}
