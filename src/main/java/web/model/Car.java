package web.model;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String type;
    private String model;
    private String color;
}