package br.com.daniel.dev.api.aws.springcloudv1.utils;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

/**
 * @author Daniel Santos
 * {@link FormatterUtils} classe útil que por motivação e finalidade múltiplas operações envolvendo formatações retornando
 * o conteúdo em  {@link String}
 * @since 28/07/2022
 */
@Slf4j
public final class FormatterUtils {

    public static final Locale pt_BR = new Locale("pt", "BR");

    private FormatterUtils() {
        throw new UnsupportedOperationException("Failed to create a new instance of FormatterUtil. Operation not allowed.");
    }

    /**
     * Método utilizado para formatar números em ponto flutuante. Este método basicamente coloca o número passado no formato: R$ [0].000,00
     *
     * @param numericValue o número a ser formatado
     * @return uma string no formato: R$ [0].000,00
     */
    public static String formatRealCurrency(final Double numericValue) {
        validateValorNumericoFormatCasasDecimais(BigDecimal.valueOf(numericValue));
        return NumberFormat.getCurrencyInstance(pt_BR).format(numericValue);
    }

    private static void validateValorNumericoFormatCasasDecimais(final BigDecimal number) {
        if (Objects.isNull(number)) throw new IllegalArgumentException("Numeric value is invalid and/or non-existent.");
    }
}
