package me.sample.javatinyormbaset.javatinyormbase.property;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("spring.datasource")
@ConstructorBinding
@Getter
@Setter
@RequiredArgsConstructor
public class DbProperties {
    private final String url;
    private final String username;
    private final String password;
}
