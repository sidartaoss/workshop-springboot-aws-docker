package com.hibicode.beerstore.resource;

import com.hibicode.beerstore.model.Beer;
import com.hibicode.beerstore.repository.Beers;
import com.hibicode.beerstore.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/beers")
public class BeerResource {

    @Autowired
    private Beers beers;

    @Autowired
    private BeerService beerService;

    @GetMapping
    public List<Beer> all() {
        // return Arrays.asList("Heineken", "Colorado Indiga", "Stella Artois", "Bohemia");
        return this.beers.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Beer create(@Valid @RequestBody Beer beer) {
         //int i = 10 / 0;
        return this.beerService.save(beer);
    }

    @PutMapping("/{id}")
    public Beer update(@PathVariable Long id,
            @Valid @RequestBody Beer beer) {
        beer.setId(id);
        return this.beerService.save(beer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.beerService.delete(id);
    }
}
