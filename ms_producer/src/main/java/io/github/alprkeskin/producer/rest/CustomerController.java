package io.github.alprkeskin.producer.rest;

import io.github.alprkeskin.producer.model.Customer;
import io.github.alprkeskin.producer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        return ok(service.addCustomer(customer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable(name = "id") int id) {
        return ok(service.getCustomer(id));
    }

    @PutMapping
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        return ok(service.updateCustomer(customer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeCustomer(@PathVariable(name = "id") int id) {
        return ok(service.removeCustomer(id));
    }
}
