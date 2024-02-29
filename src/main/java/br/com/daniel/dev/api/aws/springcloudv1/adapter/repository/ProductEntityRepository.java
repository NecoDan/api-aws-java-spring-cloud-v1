package br.com.daniel.dev.api.aws.springcloudv1.adapter.repository;

import br.com.daniel.dev.api.aws.springcloudv1.adapter.entity.product.ProductEntity;
import br.com.daniel.dev.api.aws.springcloudv1.core.port.repository.ProductEntityPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;
import java.util.random.RandomGenerator;

@Repository
@RequiredArgsConstructor
public class ProductEntityRepository implements ProductEntityPort {

    @Override
    public Optional<ProductEntity> getById(final long id) {
        return Optional.ofNullable(ProductEntity.builder()
                .id(getIdGenerate(id))
                .name(getProductName())
                .quantity(RandomGenerator.getDefault().nextInt(20, 500))
                .code(String.valueOf(RandomGenerator.getDefault().nextLong(100000L, 1000000L)))
                .price(BigDecimal.valueOf(RandomGenerator.getDefault().nextDouble(100, 10000)).doubleValue())
                .build()
        );
    }

    private long getIdGenerate(final Long id) {
        return Objects.isNull(id) || id <= BigDecimal.ZERO.intValue() ? RandomGenerator.getDefault().nextLong() : id;
    }

    private String getProductName() {
        final List<String> productsNameList = Arrays.asList(
                "Panela de Pressão Vancouver Effect Tramontina 4,5 Litros em Alumínio com Revestimento Antiaderente Preto",
                "Ventilador de Mesa ou Parede 2x1 Arno 6 Pás 40cm Turbo Force Preto VF42",
                "Sanduicheira e Grill Ultra Mondial Grelha Antiaderente 750W S-13 Preto",
                "Máquina de Lavar Electrolux 14kg 11 Programas de Lavagem Branco LED14",
                "Torradeira com Seletor de Intensidade Hamilton Beach - 22614-BZ",
                "Geladeira / Refrigerador Brastemp, Frost Free, Duplex, Com Compartimento ExtraFrio, Fresh Zone, 375L, Ivox - BRM44HK",
                "Mesa de Jantar Anita com 4 Cadeiras em MDF Tampo com Vidro Bom Pastor",
                "Micro-ondas Panasonic 34L 900W Dupla Refeição Antibacteria Ag Preto",
                "Smartphone Samsung Galaxy A34 6,6'' 128GB Octa Core Câmera 48MP 5G Prata SM-A346MZSAZTO",
                "Liquidificador Mondial, 500W, 4 Lâminas, 3 Velocidades, 2,2 L - L-99 FB",
                "Air Fryer Britânia Bella Cuccina Antiaderente 3L 1300W Preto - BCFR02P");

        return productsNameList.stream()
                .skip(new Random().nextInt(productsNameList.size()))
                .findFirst()
                .get();
    }
}
