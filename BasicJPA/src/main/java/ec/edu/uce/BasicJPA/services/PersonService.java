package ec.edu.uce.BasicJPA.services;


import ec.edu.uce.BasicJPA.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ec.edu.uce.BasicJPA.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository repository;
    public void save(Person person){
        repository.save(person);

    }

    public List<Person> read(){
        //return repository.findAll();
        List<Long> idList = new ArrayList<>();


        idList.add(1L);
        idList.add(2L);

        return repository.findAllById(idList);
    }
}
