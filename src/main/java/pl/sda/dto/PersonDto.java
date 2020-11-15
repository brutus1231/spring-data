package pl.sda.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
