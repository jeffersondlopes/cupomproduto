package br.com.cupom.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "produto")
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cProd;

    private Long cEAN;

    private String xProd;

    private String NCM;

    private Long CEST;

    private String CFOP;

    private String uCom;

    private BigDecimal qCom;

    private BigDecimal  vUnCom;

    private BigDecimal  vProd;

    private String cEANTrib;

    private String uTrib;

    private BigDecimal qTrib;

    private BigDecimal vUnTrib;

    private BigDecimal vDesc;

    private Integer indTot;

    private Integer nItemPed;

    @UpdateTimestamp
    @Column(nullable = false, columnDefinition = "datetime")
    private OffsetDateTime dtCadastro;

}
