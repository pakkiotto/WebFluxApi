package pakkiotto.webfluxrest.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pakkiotto.webfluxrest.domain.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor,String> {
}
