package conveniencestoredelivery.domain;

import conveniencestoredelivery.domain.*;
import conveniencestoredelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Reservered extends AbstractEvent {

    private Integer customerId;
    private Date reservedTimestamp;
    private Address receiverAddress;
    private String receiverPhoneNumber;
    private Date dueDate;
    private Long reservationId;

    public Reservered(Reservation aggregate){
        super(aggregate);
    }
    public Reservered(){
        super();
    }
}
