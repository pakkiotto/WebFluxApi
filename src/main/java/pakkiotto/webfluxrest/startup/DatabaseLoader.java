package pakkiotto.webfluxrest.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pakkiotto.webfluxrest.domain.Vendor;
import pakkiotto.webfluxrest.repository.VendorRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private VendorRepository vendorRepository;

    @Override
    public void run(String... args) throws Exception {
        if(vendorRepository.count().block() == 0) {
            Vendor vendor = Vendor.builder().id("id1").firstname("carmine").lastname("parisi").build();
            vendorRepository.insert(vendor).block();
        }
    }
}
