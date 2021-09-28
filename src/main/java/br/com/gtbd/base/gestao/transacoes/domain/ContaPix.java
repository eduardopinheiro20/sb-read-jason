package br.com.gtbd.base.gestao.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
    @NoArgsConstructor
public class ContaPix {

    private Integer agenciaConta;
    private String numeroConta;
    private Integer tipoConta;
    private Participante participante;


}
