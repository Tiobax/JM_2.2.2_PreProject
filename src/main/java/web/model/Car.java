package web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@Scope("prototype")
public class Car {
    private String model;
    private String series;
    private int yearOfRelease;
}
