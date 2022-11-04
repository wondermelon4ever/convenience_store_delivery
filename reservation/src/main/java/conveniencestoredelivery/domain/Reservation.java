package conveniencestoredelivery.domain;

import conveniencestoredelivery.domain.Reservered;
import conveniencestoredelivery.ReservationApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Reservation_table")
@Data

public class Reservation  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long reservationId;
    
    
    
    
    
    private Integer customerId;
    
    
    
    
    
    private Date reservedTimestamp;
    
    
    
    @Embedded
    
    private Address receiverAddress;
    
    
    
    
    
    private String receiverPhoneNumber;
    
    
    
    
    
    private Date dueDate;

    @PostPersist
    public void onPostPersist(){


        Reservered reservered = new Reservered(this);
        reservered.publishAfterCommit();

        // Get request from Delivery
        //conveniencestoredelivery.external.Delivery delivery =
        //    Application.applicationContext.getBean(conveniencestoredelivery.external.DeliveryService.class)
        //    .getDelivery(/** mapping value needed */);

    }

    public static ReservationRepository repository(){
        ReservationRepository reservationRepository = ReservationApplication.applicationContext.getBean(ReservationRepository.class);
        return reservationRepository;
    }






}
