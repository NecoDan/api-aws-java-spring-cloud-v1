package br.com.daniel.dev.api.aws.springcloudv1.adapter.http.dto.response;

import br.com.daniel.dev.api.aws.springcloudv1.utils.FormatterUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 918948771316910032L;

    @JsonProperty("id")
    private long id;
    @JsonProperty("nome_produto")
    private String name;
    @JsonProperty("codigo_produto")
    private String code;
    @JsonProperty("quantidade_disponivel")
    private int quantity;
    @JsonProperty("valor_unitario")
    private String value;

    @JsonIgnore
    private double price;

    public String getValue() {
        return FormatterUtils.formatRealCurrency(price <= 0 ? BigDecimal.ZERO.doubleValue() : price);
    }
}
