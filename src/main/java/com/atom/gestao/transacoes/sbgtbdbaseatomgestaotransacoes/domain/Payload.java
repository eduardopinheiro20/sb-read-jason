package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Payload{

    private String data;
    private String descricao;
    private String dtVencimentoPagamento;
    @Embedded
    private Favorecido favorecido;
    private String idPagamento;
    private String nsu;
    private String numeroQrCode;
    private boolean salvarContato;
    private Integer seqTransacao;
    private BigDecimal valor;
    @Embedded
    private Chave chave;

}
