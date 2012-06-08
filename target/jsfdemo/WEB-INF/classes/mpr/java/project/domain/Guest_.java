package mpr.java.project.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mpr.java.project.domain.Hotel;
import mpr.java.project.domain.Reservation;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-03T13:10:53")
@StaticMetamodel(Guest.class)
public class Guest_ { 

    public static volatile SingularAttribute<Guest, Long> id;
    public static volatile SingularAttribute<Guest, String> phone;
    public static volatile SingularAttribute<Guest, String> name;
    public static volatile SingularAttribute<Guest, String> surname;
    public static volatile SingularAttribute<Guest, Hotel> hotel;
    public static volatile ListAttribute<Guest, Reservation> reservations;

}