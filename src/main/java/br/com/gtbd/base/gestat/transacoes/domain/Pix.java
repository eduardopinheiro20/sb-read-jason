package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pix {

    private Long idTransacao;
    private Long idFraudes;
    private Long idEfetivacao;
    private String status;

    private PayloadPix payloadPix;

}
