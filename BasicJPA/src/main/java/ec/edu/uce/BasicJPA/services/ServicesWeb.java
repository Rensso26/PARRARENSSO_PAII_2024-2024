package ec.edu.uce.BasicJPA.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicesWeb {

    @RequestMapping(value = "/miurl", method = RequestMethod.GET)
    public String miPrimerEndpoint(){
        return "Este es mi primer EndPoint";
    }

    @RequestMapping(value = "/miurl2", method = RequestMethod.POST)
    public String MiSegundoEndpoint(){
        return "Este es mi segundo EndPoint";
    }

}
