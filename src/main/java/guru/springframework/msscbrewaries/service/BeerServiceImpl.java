package guru.springframework.msscbrewaries.service;


import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewaries.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jt on 2019-04-20.
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update beer
    }

    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
