package br.com.daniel.dev.api.aws.springcloudv1.core.biz;

import br.com.daniel.dev.api.aws.springcloudv1.adapter.mappers.product.ProductMapper;
import br.com.daniel.dev.api.aws.springcloudv1.core.model.product.Product;
import br.com.daniel.dev.api.aws.springcloudv1.core.port.ProductPort;
import br.com.daniel.dev.api.aws.springcloudv1.core.port.repository.ProductEntityPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductBusiness implements ProductPort {

    private final ProductEntityPort productEntityPort;
    private final ProductMapper productMapper;

    @Override
    public Product getById(final long id) {
        return productMapper.toProduct
                (productEntityPort.getById(id).orElseThrow(() -> new IllegalArgumentException("Product not found.")));
    }
}
