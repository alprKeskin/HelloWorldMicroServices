package io.github.alprkeskin.producer.service;

import io.github.alprkeskin.producer.model.Customer;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class CustomerCache {
    private ConcurrentMap<Integer, Customer> customerCache = new ConcurrentHashMap<>();

    public void addCustomer(Customer customer) {
        customerCache.put(customer.getId(), customer);
    }

    public Customer getCustomer(int id) {
        return customerCache.get(id);
    }

    public boolean removeCustomer(int id) {
        if(customerCache.containsKey(id)) {
            customerCache.remove(id);
            return true;
        }

        return false;
    }

}
