package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Emissor {

    private Long idEmissor;
    private String codigoBancoEmissor;
    private String nomeEmissor;
}
