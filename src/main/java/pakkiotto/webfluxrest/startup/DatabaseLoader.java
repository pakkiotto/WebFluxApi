package pakkiotto.webfluxrest.startup;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pakkiotto.webfluxrest.domain.Category;
import pakkiotto.webfluxrest.domain.Vendor;
import pakkiotto.webfluxrest.repository.CategoryRepository;
import pakkiotto.webfluxrest.repository.VendorRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        if(vendorRepository.count().block() == 0) {
            vendorRepository.save( Vendor
                    .builder()
                    .id("id5")
                    .firstname("Francesco")
                    .lastname("Bonesi")
                    .build())
                    .block();

            vendorRepository.save( Vendor
                    .builder()
                    .id("id4")
                    .firstname("Fulvio")
                    .lastname("D'Annibale")
                    .build())
                    .block();

            vendorRepository.save( Vendor
                    .builder()
                    .id("id3")
                    .firstname("Carmine")
                    .lastname("Parisi")
                    .build())
                    .block();

            vendorRepository.save( Vendor
                    .builder()
                    .id("id2")
                    .firstname("Francesco")
                    .lastname("Pace")
                    .build())
                    .block();

            vendorRepository.save( Vendor
                    .builder()
                    .id("id1")
                    .firstname("Simone")
                    .lastname("Aiello")
                    .build())
                    .block();


        }

        if(categoryRepository.count().block() == 0) {
            categoryRepository.save(Category
                    .builder()
                    .id("id1")
                    .description("Carne")
                    .build())
                    .block();

            categoryRepository.save(Category
                    .builder()
                    .id("id2")
                    .description("Verdure")
                    .build())
                    .block();

            categoryRepository.save(Category
                    .builder()
                    .id("id3")
                    .description("Cereali")
                    .build())
                    .block();

            categoryRepository.save(Category
                    .builder()
                    .id("id4")
                    .description("Pesce")
                    .build())
                    .block();
        }
    }
}
