package pl.sda.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.dto.PersonDto;
import pl.sda.model.Person;
import pl.sda.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<PersonDto> findAll(){
        List<PersonDto> personDtos = new ArrayList<>();
        Iterable<Person> persons = personRepository.findAll();
        for (Person person : persons) {
            personDtos.add(
                    PersonDto.builder()
                            .id(person.getId())
                            .firstName(person.getFirstName())
                            .lastName(person.getLastName())
                            .email(person.getEmail()).build());
        }
        return personDtos;
    }
}
