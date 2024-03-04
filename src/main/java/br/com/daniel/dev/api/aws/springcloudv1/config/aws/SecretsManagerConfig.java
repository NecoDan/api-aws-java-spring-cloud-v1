package br.com.daniel.dev.api.aws.springcloudv1.config.aws;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@Getter
@Setter
public class SecretsManagerConfig {

    @Value("${valor1}")
    private String secretsValue1;

    @Value("${valor2}")
    private String secretsValue2;

    @Value("${valor3}")
    private String secretsValue3;
}
