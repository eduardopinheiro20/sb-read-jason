package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TransacoesGeneric {

    private Long idTransacao;
    private Long idFraudes;
    private Long idEfetivacao;
    private String status;

}
