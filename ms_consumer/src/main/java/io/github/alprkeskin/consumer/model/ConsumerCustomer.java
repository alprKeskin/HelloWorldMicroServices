package io.github.alprkeskin.consumer.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerCustomer {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private ConsumerAddress address;
}
