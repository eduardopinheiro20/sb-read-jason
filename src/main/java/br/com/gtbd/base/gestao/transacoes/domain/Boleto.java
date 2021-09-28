package br.com.gtbd.base.gestao.transacoes.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Boleto extends TransacoesGeneric {

    private PayloadBoleto payloadBoleto;
}
