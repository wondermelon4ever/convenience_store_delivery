package conveniencestoredelivery.domain;

import conveniencestoredelivery.domain.*;
import conveniencestoredelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StateUpdated extends AbstractEvent {

    private Long id;

    public StateUpdated(){
        super();
    }
}
