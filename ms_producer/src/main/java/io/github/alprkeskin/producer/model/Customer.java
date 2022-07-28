package io.github.alprkeskin.producer.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private Address address;
}
