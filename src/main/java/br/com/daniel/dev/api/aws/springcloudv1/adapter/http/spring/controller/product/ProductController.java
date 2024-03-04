package br.com.daniel.dev.api.aws.springcloudv1.adapter.http.spring.controller.product;

import br.com.daniel.dev.api.aws.springcloudv1.adapter.http.dto.response.ProductDto;
import br.com.daniel.dev.api.aws.springcloudv1.adapter.mappers.product.ProductMapper;
import br.com.daniel.dev.api.aws.springcloudv1.core.model.product.Product;
import br.com.daniel.dev.api.aws.springcloudv1.core.port.ProductPort;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.random.RandomGenerator;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CacheConfig(cacheNames = "product")
public class ProductController {

    private final ProductPort productPort;
    private final ProductMapper productMapper;

    @GetMapping("/v1/{id}")
    @Cacheable(value = "product", key = "#id")
    public ProductDto getProductById(@PathVariable Long id) {
        return productMapper.toProductDto(
                productPort.getById(id)
        );
    }
}
