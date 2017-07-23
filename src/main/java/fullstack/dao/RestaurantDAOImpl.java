package fullstack.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fullstack.model.Restaurant;

@Repository
public class RestaurantDAOImpl implements RestaurantDao {
    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @SuppressWarnings("unchecked")
    public List<Restaurant> getRestaurantList() {
        Criteria criteria = getSession().createCriteria(Restaurant.class);
        return (List<Restaurant>) criteria.list();
    }

    public void saveOrUpdate(Restaurant restaurant) {
        getSession().saveOrUpdate(restaurant);
        
    }

    public void delete(int id) {
        Restaurant restaurant = (Restaurant) getSession().get(Restaurant.class, id);
        getSession().delete(restaurant);
        
    }

    public Restaurant findById(int id) {
        return (Restaurant) getSession().get(Restaurant.class, id);
    }

}
