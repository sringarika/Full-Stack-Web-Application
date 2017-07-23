/**
 * 
 */
package fullstack.service;

import java.util.List;

import fullstack.model.Restaurant;

/**
 * @author sringarikapandey
 *
 */
public interface RestaurantService {
    public List<Restaurant> getRestaurantList();
    public void saveOrUpdate(Restaurant restaurant);
    public void delete(int id);
    public Restaurant findById(int id);


}
