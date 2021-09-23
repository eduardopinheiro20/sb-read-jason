package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TedTef extends TransacoesGeneric {

    private PayloadTed payloadTed;
    private PayloadTef payloadTef;
}