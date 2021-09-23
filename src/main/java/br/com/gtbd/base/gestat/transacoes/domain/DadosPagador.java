package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DadosPagador {

    private String nomePagador;
    private String documentoPagador;
    private String tipoPagador;
    private ContaPagador contaPagador;

}