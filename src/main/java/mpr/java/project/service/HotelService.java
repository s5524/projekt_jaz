package mpr.java.project.service;

import java.util.List;
import javax.ejb.Stateful;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mpr.java.project.domain.Hotel;

@Stateful
@Named("hotelService")
public class HotelService {
    
    @PersistenceContext(unitName = "jaz5524_PU")
    private EntityManager em;
    
    public List<Hotel> getAll() {
        return em.createQuery("select h from Hotel h").getResultList();
    }
    
    public void delete(Hotel hotel) {
        hotel = em.merge(hotel);
        em.remove(hotel);
    }
 
    public void persist(Hotel hotel) {
        em.merge(hotel);
    }
}
