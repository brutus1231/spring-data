package pl.sda.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.dto.PersonDto;
import pl.sda.service.PersonService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonRestController {

    private final PersonService personService;

    @GetMapping("/persons/list")
    public List<PersonDto> getPersons() {
        return personService.findAll();
    }

    @PostMapping("/persons/new")
    public Long addPerson(@RequestBody PersonDto person) {
        return personService.add(person);
    }
}
