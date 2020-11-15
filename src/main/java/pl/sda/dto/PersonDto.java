package pl.sda.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto implements Serializable {

    private Long id;

    @Size(min = 3)
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String email;

}
