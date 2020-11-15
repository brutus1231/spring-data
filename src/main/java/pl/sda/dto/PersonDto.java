package pl.sda.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
public class PersonDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
