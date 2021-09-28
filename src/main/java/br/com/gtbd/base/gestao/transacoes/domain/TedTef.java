package br.com.gtbd.base.gestao.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TedTef extends GestaoTransacoes {

    private PayloadTed payloadTed;
    private PayloadTef payloadTef;
}
