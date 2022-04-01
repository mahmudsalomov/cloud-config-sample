package uz.maniac4j.configuration_cotrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private DbSettings settings;

    @Value("${message}")
    private String message;

    @GetMapping("/")
    public String test(){
        System.out.println(settings);
        return message;
    }

}
