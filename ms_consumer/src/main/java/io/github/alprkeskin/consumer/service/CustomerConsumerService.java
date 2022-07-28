package io.github.alprkeskin.consumer.service;

import io.github.alprkeskin.consumer.model.ConsumerCustomer;
import io.github.alprkeskin.consumer.properties.ConsumerUrlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class CustomerConsumerService {
    @Autowired
    private ConsumerUrlProperties urlProperties;
    @Autowired
    private RestTemplate restTemplate;
    @Value("${alprkeskin.consumed-urls.customer}")
    private String URL;

    public ConsumerCustomer getCustomer(int id, boolean readFromValue) {
        ConsumerCustomer customer = restTemplate.getForObject(getUri(id, readFromValue), ConsumerCustomer.class);
        customer.getAddress().setConstruction("colombia");
        return customer;
    }

    private URI getUri(int id, boolean readFromValue) {
        String url = readFromValue ? URL : urlProperties.getCustomer();
        return URI.create(url + id);
    }
}
