package br.com.cupom.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Data
public class ProdutoModel {

    @JsonProperty("cProd")
    private String cProd;

    @JsonProperty("cEAN")
    private Long cEAN;

    @JsonProperty("xProd")
    private String xProd;

    @JsonProperty("NCM")
    private String NCM;

    @JsonProperty("CEST")
    private Long CEST;

    @JsonProperty("CFOP")
    private String CFOP;

    @JsonProperty("uCom")
    private String uCom;

    @JsonProperty("qCom")
    private BigDecimal qCom;

    @JsonProperty("vUnCom")
    private BigDecimal  vUnCom;

    @JsonProperty("vProd")
    private BigDecimal  vProd;

    @JsonProperty("cEANTrib")
    private String cEANTrib;

    @JsonProperty("uTrib")
    private String uTrib;

    @JsonProperty("qTrib")
    private BigDecimal qTrib;

    @JsonProperty("vUnTrib")
    private BigDecimal vUnTrib;

    @JsonProperty("vDesc")
    private BigDecimal vDesc;

    @JsonProperty("indTot")
    private Integer indTot;

    @JsonProperty("nItemPed")
    @PositiveOrZero
    private Integer nItemPed;

}