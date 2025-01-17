package jedwik.springframework.msscbreweryclient.web.client;

import jedwik.springframework.msscbreweryclient.MsscBreweryClientApplication;
import jedwik.springframework.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.then;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());

        assertNotNull(dto);
    }

    @Test
    void saveNewBeer() {
        BeerDto dto = BeerDto.builder().beerName("Super Scout").build();
        URI uri = client.saveNewBeer(dto);
        assertNotNull(uri);
        System.out.println(uri);
    }

    @Test
    void updateBeer() {
        BeerDto dto = BeerDto.builder().beerName("Super Scout").build();
        UUID uuid = UUID.randomUUID();
        client.updateBeer(uuid, dto);
    }

    @Test
    void deleteBeer() {
        client.deleteBeer(UUID.randomUUID());
    }
}
