package pakkiotto.webfluxrest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pakkiotto.webfluxrest.domain.Vendor;
import pakkiotto.webfluxrest.repository.VendorRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
public class VendorController {

    private final VendorRepository vendorRepository;

    @GetMapping("api/v1/vendors")
    Flux<Vendor> getVendors(){
        return vendorRepository.findAll();
    }

    @GetMapping("api/v1/vendors/{id}")
    Mono<Vendor> getVendorById(@PathVariable String id){
        return vendorRepository.findById(id);
    }

}
