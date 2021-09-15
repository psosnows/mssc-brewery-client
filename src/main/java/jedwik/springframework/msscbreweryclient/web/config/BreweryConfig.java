package jedwik.springframework.msscbreweryclient.web.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix="sfg.brewery")
@ConstructorBinding
public class BreweryConfig {

    public final String BEER_PATH_V1 = "/api/v1/beer/";

    @Getter
    private final String apihost;

    public BreweryConfig(String apihost) {
        this.apihost = apihost;
    }
}
