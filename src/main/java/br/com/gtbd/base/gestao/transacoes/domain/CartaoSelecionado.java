package br.com.gtbd.base.gestao.transacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartaoSelecionado {

    private String bandeira;
    private Integer codigoTipo;
    private String dataVencimento;
    private String ultimosDigitos;
}