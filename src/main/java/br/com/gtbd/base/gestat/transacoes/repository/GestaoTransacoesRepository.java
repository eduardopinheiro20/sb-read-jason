package br.com.gtbd.base.gestat.transacoes.repository;

import br.com.gtbd.base.gestat.transacoes.domain.Boleto;
import br.com.gtbd.base.gestat.transacoes.domain.Pix;
import br.com.gtbd.base.gestat.transacoes.domain.Ted;
import br.com.gtbd.base.gestat.transacoes.domain.Tef;

public interface GestaoTransacoesRepository {

    Boolean addPix(Pix pPix);

    Boolean addTed(Ted pTed);

    Boolean addTef(Tef pTef);

    Boolean addBoleto(Boleto pBoleto);

}