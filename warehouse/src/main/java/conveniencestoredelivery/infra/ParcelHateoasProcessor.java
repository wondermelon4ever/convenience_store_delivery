package conveniencestoredelivery.infra;
import conveniencestoredelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ParcelHateoasProcessor implements RepresentationModelProcessor<EntityModel<Parcel>>  {

    @Override
    public EntityModel<Parcel> process(EntityModel<Parcel> model) {

        
        return model;
    }
    
}
