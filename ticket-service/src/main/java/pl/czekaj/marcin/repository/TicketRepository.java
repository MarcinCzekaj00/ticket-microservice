package pl.czekaj.marcin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.czekaj.marcin.entity.Ticket;

@Repository
public interface TicketRepository extends MongoRepository<Ticket, String> {

    Ticket findByMovieName(String movieName);
}
