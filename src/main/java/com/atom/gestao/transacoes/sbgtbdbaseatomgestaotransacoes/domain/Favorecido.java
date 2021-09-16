package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@Entity
@Embeddable
public class Favorecido {

    private Integer agencia;
    private String numero;
    private Integer idParticipante;
    private String nomeParticipante;
    private Integer tipo;
    private String documento;
    private String nome;

}
