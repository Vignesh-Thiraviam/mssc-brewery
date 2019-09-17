package guru.springframework.msscbrewaries.service;



import java.util.UUID;

import guru.springframework.msscbrewaries.web.model.BeerDto;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
