package pl.sda.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class PersonDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
