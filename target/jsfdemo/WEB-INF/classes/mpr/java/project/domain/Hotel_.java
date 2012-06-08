package mpr.java.project.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mpr.java.project.domain.Guest;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-06-03T13:10:53")
@StaticMetamodel(Hotel.class)
public class Hotel_ { 

    public static volatile SingularAttribute<Hotel, Long> id;
    public static volatile SingularAttribute<Hotel, String> adress;
    public static volatile SingularAttribute<Hotel, String> phone;
    public static volatile SingularAttribute<Hotel, String> name;
    public static volatile ListAttribute<Hotel, Guest> guests;

}