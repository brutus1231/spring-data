package pl.sda.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.sda.model.Person;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByFirstName(String firstName);

    @Query("select p from Person p where p.firstName like :name or p.lastName like :name ")
    List<Person> findByParams(@Param("name") String name);


}
