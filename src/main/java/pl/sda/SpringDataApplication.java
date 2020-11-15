package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.model.Person;
import pl.sda.repository.PersonRepository;

@SpringBootApplication
public class SpringDataApplication implements ApplicationRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		personRepository.save(createPerson("Marta", "Kowalska", "marta@wp.pl"));
		personRepository.save(createPerson("Kasia", "Mazur", "kasia@wp.pl"));
		personRepository.save(createPerson("Ola", "Nowak", "ola@gmail.com"));
	}

	private Person createPerson(String firstName, String lastName, String email) {
		return Person.builder().firstName(firstName)
				.lastName(lastName)
				.email(email)
				.build();
	}
}
