package com.hibicode.beerstore.service;

import com.hibicode.beerstore.model.Beer;
import com.hibicode.beerstore.repository.Beers;
import com.hibicode.beerstore.service.exception.BeerAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BeerService {

//    public void save(Beer beer) {
//        throw new BeerAlreadyExistException();
//    }

//    @Autowired
    private Beers beers;

    public BeerService(@Autowired Beers beers) {
        this.beers = beers;
    }

    public Beer save(final Beer beer) {
        Optional<Beer> beerByNameAndType = this.beers.findByNameAndType(beer.getName(), beer.getType());

        if (beerByNameAndType.isPresent()) {
            throw new BeerAlreadyExistException();
        }

        return this.beers.save(beer);
    }
}
