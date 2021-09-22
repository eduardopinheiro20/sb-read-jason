package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayloadTed {


    private Integer codigoFinalidade;
    private Integer codigoLiquidacao;
    private Integer codigoSistemaOrigem;
    private Integer codigoTipoContaFavorecido;
    private Integer codigoTipoContaRementente;
    private Integer codigoTipoTransacao;
    private LocalDateTime dataTransferencia;
    private String descricaoTransacao;
    private Integer indentificadorBancoFavorecido;
    private Integer identificadorBancoRementente;
    private String nomeFavorecido;
    private Integer numeroAgenciaFavorecido;
    private Integer numeroAgenciaRemetente;
    private Integer numeroContaFavorecido;
    private Integer numeroContaRemetente;
    private String numeroCpfCnpjFavorecido;
    private Boolean salvarFavorecido;
    private String tipoPessoaFavorecido;
    private BigDecimal valorTransacao;


}
