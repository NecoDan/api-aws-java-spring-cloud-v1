package br.com.daniel.dev.api.aws.springcloudv1.adapter.http.spring.controller.aws;

import br.com.daniel.dev.api.aws.springcloudv1.config.aws.ParamStoreConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws/v1")
@RequiredArgsConstructor
public class ParamStoreController {

    private final ParamStoreConfig paramStoreConfig;

    @GetMapping("/paramstore_configuration")
    public String getParamStoreConfigurarion() {
        return paramStoreConfig.getParamStoreHelloWord();
    }
}
