package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Emissor {

    private Long identificador;
    private String codigoBanco;
    private String nome;
}
