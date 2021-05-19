package Snixies.beerinfoservice.resources;

import Snixies.beerinfoservice.models.Beer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beers")
public class BeerResource {
    @RequestMapping("/{beerId}")
    public Beer getBeerInfo(@PathVariable("beerId") int beerId){
        return new Beer(beerId, "Het bier dat bij deze Id hoort.");

    }
}
