package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DadosPagador {

    private String nomeSacador;
    private String documentoSacador;
    private String tipoSacador;
    private ContaPagador contaPagador;

}
