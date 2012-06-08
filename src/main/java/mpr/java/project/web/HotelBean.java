package mpr.java.project.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import mpr.java.project.domain.Hotel;
import mpr.java.project.service.HotelService;

@SessionScoped
@Named("hotelBean")
public class HotelBean implements Serializable{
    
    private ListDataModel<Hotel> hotels = new ListDataModel<Hotel>();
    private Hotel hotel;
    
    @Inject
    private HotelService hotelService;
    
    public String addHotel() { 
        hotel = new Hotel();
        return "addHotel"; 
    }
    
    public String editHotel() { 
        hotel = hotels.getRowData();
        return "editHotel"; 
    }
    
    public String persistHotel() { 
        hotelService.persist(hotel);
        return "list"; 
    }
    
    public String deleteHotel() {
        hotel = hotels.getRowData();
        hotelService.delete(hotel);
        return "list";
    }
    
    public String showHotel() {
        hotel = hotels.getRowData();
        return "showHotel";
    }
    
    public ListDataModel<Hotel> getHotels() {
        hotels.setWrappedData(hotelService.getAll());
        return hotels;
    }
    
    public Hotel getHotel() {
        return hotel;
    }
    
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
