package io.github.alprkeskin.consumer.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConsumerAddress {
    private String country;
    private String city;
    private String street;
    private String construction;
}
