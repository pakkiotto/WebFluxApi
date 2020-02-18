package pakkiotto.webfluxrest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pakkiotto.webfluxrest.domain.Category;
import pakkiotto.webfluxrest.repository.CategoryRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @GetMapping("api/v1/categories")
    Flux<Category> getCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("api/v1/categories/{id}")
    Mono<Category> getCategoryById(@PathVariable String id){
        return categoryRepository.findById(id);
    }
}
