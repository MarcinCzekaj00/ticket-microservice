package pl.czekaj.marcin.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudRoutingConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes().route(
                r -> r.path("/ticket-enquiry/**")
                        .uri("http://localhost:8700/")
        ).build();
    }
}
