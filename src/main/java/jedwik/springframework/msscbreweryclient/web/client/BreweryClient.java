package jedwik.springframework.msscbreweryclient.web.client;

import jedwik.springframework.msscbreweryclient.web.model.BeerDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@Component
public class BreweryClient {

    private final BreweryConfig config;

    private final RestTemplate restTemplate;

    public BreweryClient(BreweryConfig breweryConfig, RestTemplateBuilder restTemplateBuilder) {
        this.config = breweryConfig;
        this.restTemplate = restTemplateBuilder.build();
    }

    public BeerDto getBeerById(UUID uuid) {
        return restTemplate.getForObject(config.getApihost()+ config.BEER_PATH_V1 + uuid.toString(), BeerDto.class);
    }

    public URI saveNewBeer(BeerDto beerDto) {
        return restTemplate.postForLocation(config.getApihost() + config.BEER_PATH_V1, beerDto);
    }
}
