package br.com.daniel.dev.api.aws.springcloudv1.core.port.repository;

import br.com.daniel.dev.api.aws.springcloudv1.adapter.entity.product.ProductEntity;

import java.util.Optional;

public interface ProductEntityPort {
    Optional<ProductEntity> getById(long id);
}
