package br.com.gtbd.base.gestao.transacoes.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Boleto extends GestaoTransacoes {

    private PayloadBoleto payloadBoleto;
}
