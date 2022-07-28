package io.github.alprkeskin.consumer.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties("alprkeskin.consumed-urls")
public class ConsumerUrlProperties {
    private String customer;
}
