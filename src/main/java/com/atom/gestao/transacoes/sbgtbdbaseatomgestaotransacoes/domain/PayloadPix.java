package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Data
@Entity
@Embeddable
public class PayloadPix {

    private String data;
    private String descricao;
    private String dtVencimentoPagamento;
    @Embedded
    private Favorecido favorecido;
    private String idPagamento;
    private String nsu;
    private String numeroQrCode;
    private boolean salvarContrato;
    private Integer seqTransacao;
    private BigDecimal valor;
    @Embedded
    private Chave chave;

}
