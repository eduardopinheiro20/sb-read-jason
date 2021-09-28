package br.com.gtbd.base.gestao.transacoes.domain;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pix extends TransacoesGeneric {

    private PayloadPix payloadPix;

}
