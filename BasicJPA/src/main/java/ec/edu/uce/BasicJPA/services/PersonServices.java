package ec.edu.uce.BasicJPA.services;

import ec.edu.uce.BasicJPA.models.Person;
import ec.edu.uce.BasicJPA.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServices {
    @Autowired
    PersonRepository repository;

    public void save(Person person){
        repository.save(person);
    }
    public List<Person> findAll(){
        return repository.findAll();
    }
    public Optional<Person> findById(long id){
        return repository.findById(id);
    }
    public List<Person> findByName(String name){
        Person personExample = new Person();
        personExample.setName(name);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnorePaths("id","lastname","age")
                .withMatcher("name",ExampleMatcher.GenericPropertyMatchers.exact());
        Example<Person> example = Example.of(personExample, matcher);

        return repository.findBy(example, query -> query.all());
    }
    public List<Person> findByLastName(String lastname){
        Person personExample = new Person();
        personExample.setLastname(lastname);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnorePaths("id","name","age")
                .withMatcher("lastname",ExampleMatcher.GenericPropertyMatchers.exact());
        Example<Person> example = Example.of(personExample, matcher);

        return repository.findBy(example, query -> query.all());
    }
    public void delete(long id){
        repository.deleteById(id);
    }
    

}
