package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

    private Integer agencia;
    private String numero;
    private Participante participante;
    private Integer tipoConta;

}
