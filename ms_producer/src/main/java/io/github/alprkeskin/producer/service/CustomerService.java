package io.github.alprkeskin.producer.service;

import io.github.alprkeskin.producer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CustomerService {
    @Autowired
    private CustomerCache customerCache;

    private AtomicInteger idCounter = new AtomicInteger();

    public String addCustomer(Customer customer) {
        customer.setId(idCounter.incrementAndGet());
        customerCache.addCustomer(customer);
        return "Customer is successfully added. Id: " + customer.getId();
    }

    public Customer updateCustomer(Customer customer) {
        customerCache.addCustomer(customer);
        return getCustomer(customer.getId());
    }

    public String removeCustomer(int id) {
        String message = customerCache.removeCustomer(id) ?
                "Customer is deleted." : "Customer not found";

        return message + "Id: " + id;
    }

    public Customer getCustomer(int id) {
        return customerCache.getCustomer(id);
    }
}
