package br.com.daniel.dev.api.aws.springcloudv1.core.model.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 918948771316910032L;

    private long id;
    private String name;
    private String code;
    private int quantity;
    private double price;

}
