package uz.maniac4j.configuration_cotrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
public class Controller {

    @Autowired
    private DbSettings settings;

    @Value("${my.message}")
    private String message;

    @GetMapping("/test")
    public String test(){
        System.out.println(settings);
        return settings.toString()+"\n"+message;
    }

}
