package pl.czekaj.marcin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("pl.czekaj.marcin")
public class TicketEnquiryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketEnquiryServiceApplication.class, args);
    }

}
