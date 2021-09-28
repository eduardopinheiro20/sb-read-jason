package br.com.gtbd.base.gestao.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Participante {

    private Integer idParticipante;
    private String nomeParticipante;
}
