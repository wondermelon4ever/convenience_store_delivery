package conveniencestoredelivery.domain;

import conveniencestoredelivery.domain.*;
import conveniencestoredelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class InboundCompleted extends AbstractEvent {

    private String invoiceId;
    private Long parcelId;
    private String status;
    private Date inboundTimeStamp;

    public InboundCompleted(Parcel aggregate){
        super(aggregate);
    }
    public InboundCompleted(){
        super();
    }
}
