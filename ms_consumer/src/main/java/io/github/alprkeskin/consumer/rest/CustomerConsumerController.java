package io.github.alprkeskin.consumer.rest;

import io.github.alprkeskin.consumer.model.ConsumerCustomer;
import io.github.alprkeskin.consumer.service.CustomerConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/customer")
public class CustomerConsumerController {
    @Autowired
    private CustomerConsumerService service;
    @GetMapping("/{id}")
    public ResponseEntity<ConsumerCustomer> getCustomer(@PathVariable("id") int id,
                                                        @RequestParam(defaultValue = "false") boolean readFromValue) {
        return ok(service.getCustomer(id, readFromValue));
    }
}
