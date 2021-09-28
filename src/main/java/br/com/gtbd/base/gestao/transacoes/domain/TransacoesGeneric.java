package br.com.gtbd.base.gestao.transacoes.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TransacoesGeneric {

    private String idTransacao;
    private Long idFraudes;
    private Long idEfetivacao;
    private String status;

}
