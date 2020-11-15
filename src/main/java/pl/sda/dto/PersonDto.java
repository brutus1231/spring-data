package pl.sda.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
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
