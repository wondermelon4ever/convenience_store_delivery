package conveniencestoredelivery.domain;

import conveniencestoredelivery.domain.*;
import conveniencestoredelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CvsDeliveryCompleted extends AbstractEvent {

    private String status;
    private Integer customerId;
    private Long deliveryId;
    private Long invoicedId;
    private Date timestamp;

    public CvsDeliveryCompleted(Delivery aggregate){
        super(aggregate);
    }
    public CvsDeliveryCompleted(){
        super();
    }
}
