package conveniencestoredelivery.domain;

import conveniencestoredelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="parcels", path="parcels")
public interface ParcelRepository extends PagingAndSortingRepository<Parcel, Long>{

}
