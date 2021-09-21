package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayloadBoleto {

    private Integer contaOrigem;
    private Integer bancoOrigem;
    private Integer agenciaOrigem;
    private CartaoSelecionado cartaoSelecionado;
    private String codigoBarra;
    private Integer codigoSitemaOrigem;
    private Integer codigoTipoPagamento;
    private String dataEfeticacao;
    private String formaPagamento;
    private String linhaDigitavel;
    private BigDecimal valorPagamento;
    private BigDecimal valorpagamentoIOF;
    private Beneficiario beneficiario;
    private SacadorAvalista sacadorAvalista ;
    private DadosPagador dadosPagdor;
    private Emissor emissor;

}
