package conveniencestoredelivery.domain;

import conveniencestoredelivery.domain.*;
import conveniencestoredelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class LoadingCompleted extends AbstractEvent {

    private String invoiceId;
    private Long parcelId;
    private String status;
    private Date outboundTimeStamp;

    public LoadingCompleted(Parcel aggregate){
        super(aggregate);
    }
    public LoadingCompleted(){
        super();
    }
}
