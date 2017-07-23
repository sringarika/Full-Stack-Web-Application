/**
 * 
 */
package fullstack.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fullstack.dao.RestaurantDao;
import fullstack.model.Restaurant;

/**
 * @author sringarikapandey
 *
 */
@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {
    RestaurantDao restaurantDao; 

    /**
     * @param restaurantDao the restaurantDao to set
     */
    @Autowired
    public void setRestaurantDao(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantDao.getRestaurantList();
    }

    public void saveOrUpdate(Restaurant restaurant) {
        restaurantDao.saveOrUpdate(restaurant);
        
    }

    public void delete(int id) {
        restaurantDao.delete(id);
        
    }

    public Restaurant findById(int id) {
        return restaurantDao.findById(id);
    }
    

}
