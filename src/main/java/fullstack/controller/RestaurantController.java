/**
 * 
 */
package fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fullstack.model.Restaurant;
import fullstack.service.RestaurantService;

/**
 * @author sringarikapandey
 *
 */
@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restService;
    @RequestMapping(value = "/restaurant/", method = RequestMethod.GET, headers = "Accept = application/json")
    public @ResponseBody List<Restaurant> getRestaurantList() {
        List<Restaurant> restaurants = restService.getRestaurantList();
        return restaurants;
    }
    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public @ResponseBody Restaurant add(@RequestBody Restaurant restaurant) {
        restService.saveOrUpdate(restaurant);
        return restaurant;
    }
    @RequestMapping(value = "/update{id}/", method = RequestMethod.PUT)
    public @ResponseBody Restaurant update(@PathVariable("id") int id, @RequestBody Restaurant restaurant) {
        restaurant.setId(id);
        restService.saveOrUpdate(restaurant);
        return restaurant;
    }
    @RequestMapping(value = "/delete{id}/", method = RequestMethod.DELETE)
    public @ResponseBody Restaurant delete(@PathVariable("id") int id) {
        Restaurant rest = restService.findById(id);
        restService.delete(id);
        return rest;
    }

}
