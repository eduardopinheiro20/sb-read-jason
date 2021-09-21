package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tef {

    private Integer idTrasacao;
    private Integer idFraude;
    private Integer idEfetivacao;
    private Integer status;
    private PayloadTef payloadTef;
}
