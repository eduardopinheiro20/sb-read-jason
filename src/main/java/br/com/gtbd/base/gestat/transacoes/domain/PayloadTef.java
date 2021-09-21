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
public class PayloadTef {

    private Integer codigoBancoFavorecido;
    private Integer codigoBancoRemetente;
    private Integer codigoLiquidacao;
    private Integer codigoSistemaOrigem;
    private Integer codigoTipoContaFavorecido;
    private Integer codigoTopoContaRementente;
    private Integer codigoTipoTransacao;
    private LocalDateTime dataTransferencia;
    private String descricaoTransacao;
    private Integer numeroAgenciaFavorecido;
    private Integer numeroAgenciaRemetente;
    private Integer numeroContaFavorecido;
    private Integer numeroContaRemetente;
    private boolean salvarFavorecido;
    private BigDecimal valorTransacao;

}
