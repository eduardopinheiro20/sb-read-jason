package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Participante {

    private Integer identificador;
    private String nomeParticipante;
}
