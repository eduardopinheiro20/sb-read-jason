package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Chave {

    private String codigo;
    private String tipo;

}
