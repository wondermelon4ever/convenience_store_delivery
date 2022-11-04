package conveniencestoredelivery.domain;

import conveniencestoredelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="invoices", path="invoices")
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long>{

}
