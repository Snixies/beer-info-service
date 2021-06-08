package Snixies.beerinfoservice.resources;

import Snixies.beerinfoservice.models.Beer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/beers")
public class BeerResource {
    private ArrayList beers;

    @RequestMapping("/{beerId}")
    public Beer getBeerInfo(@PathVariable("beerId") int beerId){
        return new Beer(beerId, "Het bier dat bij deze Id hoort.", "Beschrijving ervan.");

    }
    @PostMapping( "/addBeer/{beerId}/{beerName}/{beerDescription}")
    public void addBeer(@PathVariable("beerId") int beerId, @PathVariable("beerName") String beerName, @PathVariable("beerDescriptoin") String beerDescription, @RequestBody Beer beer){
        beer.setBeerId(beerId);
        beer.setName(beerName);
        beer.setDescription(beerDescription);

        beers.add(beer);
        System.out.println(beers);
    }
}
