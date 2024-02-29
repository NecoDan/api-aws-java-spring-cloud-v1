package br.com.daniel.dev.api.aws.springcloudv1.core.port;

import br.com.daniel.dev.api.aws.springcloudv1.core.model.product.Product;

public interface ProductPort {
    Product getById(long id);
}
