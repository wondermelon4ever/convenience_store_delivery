package conveniencestoredelivery.infra;
import conveniencestoredelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class InvoiceHateoasProcessor implements RepresentationModelProcessor<EntityModel<Invoice>>  {

    @Override
    public EntityModel<Invoice> process(EntityModel<Invoice> model) {

        
        return model;
    }
    
}
