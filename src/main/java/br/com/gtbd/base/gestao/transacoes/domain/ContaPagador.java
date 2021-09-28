package br.com.gtbd.base.gestao.transacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaPagador {

    private Banco banco;
    private String agencia;
    private String conta;
}
