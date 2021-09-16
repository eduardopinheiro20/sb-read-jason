package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@Entity
@Embeddable
public class Chave {
    private String codigo;
    private String tipo;

}
