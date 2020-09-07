package kr.co.limseongkyu.babbab.interfaces;

import kr.co.limseongkyu.babbab.domain.Restaurant;
import kr.co.limseongkyu.babbab.domain.RestaurantRepository;
import kr.co.limseongkyu.babbab.domain.RestaurantRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantRepository repository;

    @GetMapping("/restaurants")
    public List<Restaurant> list()
    {
        List<Restaurant> restaurants = repository.findAll();
        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){

        Restaurant restaurant = repository.findById(id);

        return restaurant;
    }
}
