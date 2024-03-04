package br.com.daniel.dev.api.aws.springcloudv1.adapter.http.spring.controller.aws;

import br.com.daniel.dev.api.aws.springcloudv1.config.aws.ParamStoreConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paramstore")
@RequiredArgsConstructor
public class ParamStoreController {

    private final ParamStoreConfig paramStoreConfig;

    @GetMapping("/v1/configuration")
    public String getParamStoreConfiguration() {
        return paramStoreConfig.getParamStoreHelloWord();
    }
}
