package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
public class Pix {

    private Long idTransacao;
    private Long idFraudes;
    private Long idEfetivacao;
    private String status;
    @Embedded
    private PayloadPix payload;

}
