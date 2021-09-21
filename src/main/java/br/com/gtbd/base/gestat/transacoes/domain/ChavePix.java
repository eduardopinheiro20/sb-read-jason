package br.com.gtbd.base.gestat.transacoes.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChavePix {

    private String codigoChave;
    private String tipoChave;

}
