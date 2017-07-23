package fullstack.dao;

import java.util.List;

import fullstack.model.Restaurant;

public interface RestaurantDao {
    public List<Restaurant> getRestaurantList();
    public void saveOrUpdate(Restaurant restaurant);
    public void delete(int id);
    public Restaurant findById(int id);

}
