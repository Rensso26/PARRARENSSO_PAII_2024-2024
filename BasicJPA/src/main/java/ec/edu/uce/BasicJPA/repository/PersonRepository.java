package ec.edu.uce.BasicJPA.repository;

import ec.edu.uce.BasicJPA.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
