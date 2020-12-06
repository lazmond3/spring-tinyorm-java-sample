package me.sample.javatinyormbaset.javatinyormbase.property;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("spring.datasource")
@ConstructorBinding
@RequiredArgsConstructor
public class DbProperties {
    @Getter
    private final String url;
    @Getter
    private final String username;
    @Getter
    private final String password;

}
