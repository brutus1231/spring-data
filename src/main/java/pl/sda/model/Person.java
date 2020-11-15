package pl.sda.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Data
public class Person {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

}
