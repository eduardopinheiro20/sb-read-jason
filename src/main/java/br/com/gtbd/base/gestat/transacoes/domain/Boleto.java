package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Boleto {

    private Long idTransacao;
    private Long idFraudes;
    private Long idEfetivacao;
    private String status;
    private PayloadBoleto payloadBoleto;
}
