package mpr.java.project.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mpr.java.project.domain.Guest;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-03T13:10:53")
@StaticMetamodel(Reservation.class)
public class Reservation_ { 

    public static volatile SingularAttribute<Reservation, Long> id;
    public static volatile SingularAttribute<Reservation, Integer> roomNumber;
    public static volatile SingularAttribute<Reservation, Guest> guest;
    public static volatile SingularAttribute<Reservation, String> resDate;

}