package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pix {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTransacao;
    private Long idFraudes;
    private Long idEfetivacao;
    private String status;
    @Embedded
    private Payload payload;

}
