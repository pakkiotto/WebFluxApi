package pakkiotto.webfluxrest.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pakkiotto.webfluxrest.domain.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
