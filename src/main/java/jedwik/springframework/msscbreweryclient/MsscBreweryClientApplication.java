package jedwik.springframework.msscbreweryclient;

import jedwik.springframework.msscbreweryclient.web.config.BreweryConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(BreweryConfig.class)
public class MsscBreweryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBreweryClientApplication.class, args);
    }

}
