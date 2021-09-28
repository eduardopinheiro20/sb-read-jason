package br.com.gtbd.base.gestao.transacoes.repository;

import br.com.gtbd.base.gestao.transacoes.domain.Boleto;
import br.com.gtbd.base.gestao.transacoes.domain.Pix;
import br.com.gtbd.base.gestao.transacoes.domain.TedTef;
import br.com.gtbd.base.gestao.transacoes.domain.TransacoesGeneric;

import java.util.List;

public interface GestaoTransacoesRepository {

    Boolean addPix(Pix pPix);

    Boolean addTedTef(TedTef pTed);

    Boolean addBoleto(Boleto pBoleto);

    List<TransacoesGeneric> listTransacoes();

}
