package com.hibicode.beerstore.resource;

import com.hibicode.beerstore.model.Beer;
import com.hibicode.beerstore.repository.Beers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerResource {

    @Autowired
    private Beers beers;

    @GetMapping
    public List<String> all() {
        return Arrays.asList("Heineken", "Colorado Indiga", "Stella Artois", "Bohemia");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Beer create(@RequestBody Beer beer) {
        return this.beers.save(beer);
    }
}
