package br.com.daniel.dev.api.aws.springcloudv1.adapter.mappers.product;

import br.com.daniel.dev.api.aws.springcloudv1.adapter.entity.product.ProductEntity;
import br.com.daniel.dev.api.aws.springcloudv1.adapter.http.dto.response.ProductDto;
import br.com.daniel.dev.api.aws.springcloudv1.core.model.product.Product;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductMapper {

    private final ModelMapper modelMapper;

    public Product toProduct(final ProductEntity entity) {
        return modelMapper.map(entity, Product.class);
    }

    public ProductDto toProductDto(final Product entity) {
        return modelMapper.map(entity, ProductDto.class);
    }

}
