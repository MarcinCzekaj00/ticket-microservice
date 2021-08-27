package pl.czekaj.marcin.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="property-file")
@Setter
@Getter
public class PropertyAccessBean {

    private String name;
    private String description;

}
