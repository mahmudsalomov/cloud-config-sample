package uz.maniac4j.configuration_cotrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
@EnableConfigurationProperties
public class ConfigurationCotrolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationCotrolApplication.class, args);
    }

}
