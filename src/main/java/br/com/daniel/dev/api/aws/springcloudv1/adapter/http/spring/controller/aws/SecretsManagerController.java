package br.com.daniel.dev.api.aws.springcloudv1.adapter.http.spring.controller.aws;

import br.com.daniel.dev.api.aws.springcloudv1.config.aws.SecretsManagerConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secrets")
@RequiredArgsConstructor
public class SecretsManagerController {

    private final SecretsManagerConfig secretsManagerConfig;

    @GetMapping("/v1/configuration")
    public String getSecretsConfiguration() {
        return String.format("%s | %s  | %s ", secretsManagerConfig.getSecretsValue1(),
                secretsManagerConfig.getSecretsValue2(), secretsManagerConfig.getSecretsValue3());
    }
}
