package conveniencestoredelivery.infra;

import conveniencestoredelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="myParcels", path="myParcels")
public interface MyParcelRepository extends PagingAndSortingRepository<MyParcel, Long> {

    List<MyParcel> findByReservationId(Long reservationId);
List<MyParcel> findByInvoiceId(Long invoiceId);


    
}
