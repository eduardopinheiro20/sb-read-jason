package br.com.gtbd.base.gestat.transacoes.service;

import br.com.gtbd.base.gestat.transacoes.domain.Boleto;
import br.com.gtbd.base.gestat.transacoes.domain.Pix;
import br.com.gtbd.base.gestat.transacoes.domain.TedTef;
import br.com.gtbd.base.gestat.transacoes.firebase.FirebaseInitializer;
import br.com.gtbd.base.gestat.transacoes.repository.GestaoTransacoesRepository;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GestaoTransacoesService implements GestaoTransacoesRepository{

    @Autowired
    private FirebaseInitializer firebase;

    @Override
    public Boolean addPix(final Pix pPix) {
        Map<String, Object> docData = new HashMap<>();
        docData.put("idTransacao", pPix.getIdTransacao());
        docData.put("idFraudes", pPix.getIdFraudes());
        docData.put("idEfetivacao", pPix.getIdEfetivacao());
        docData.put("status", pPix.getStatus());
        docData.put("codigoChave", pPix.getPayloadPix().getChavePix().getCodigoChave());
        docData.put("tipoChave", pPix.getPayloadPix().getChavePix().getTipoChave());
        docData.put("data", pPix.getPayloadPix().getData());
        docData.put("descricao", pPix.getPayloadPix().getDescricao());
        docData.put("dtVencimentoPagamento", pPix.getPayloadPix().getDtVencimentoPagamento());
        docData.put("documentoFavorecido", pPix.getPayloadPix().getFavorecido().getDocumentoFavorecido());
        docData.put("nomeFavorecido", pPix.getPayloadPix().getFavorecido().getNomeFavorecido());
        docData.put("agenciaConta", pPix.getPayloadPix().getFavorecido().getContaPix().getAgenciaConta());
        docData.put("numeroConta", pPix.getPayloadPix().getFavorecido().getContaPix().getNumeroConta());
        docData.put("tipoConta", pPix.getPayloadPix().getFavorecido().getContaPix().getTipoConta());
        docData.put("idParticipante",
                        pPix.getPayloadPix().getFavorecido().getContaPix().getParticipante().getIdParticipante());
        docData.put("nomeParticipante",
                        pPix.getPayloadPix().getFavorecido().getContaPix().getParticipante().getNomeParticipante());
        docData.put("idPagamento", pPix.getPayloadPix().getIdPagamento());
        docData.put("nsu", pPix.getPayloadPix().getNsu());
        docData.put("numeroQrCode", pPix.getPayloadPix().getNumeroQrCode());
        docData.put("salvarContrato", pPix.getPayloadPix().getSalvarContrato());
        docData.put("seqTransacao", pPix.getPayloadPix().getSeqTransacao());
        docData.put("valor", pPix.getPayloadPix().getValor());

        return resultadoApi(docData);

    }

    @Override
    public Boolean addTedTef(final TedTef pTedTef) {
        Map<String, Object> docData = new HashMap<>();
        docData.put("idTransacao", pTedTef.getIdTransacao());
        docData.put("idFraudes", pTedTef.getIdFraudes());
        docData.put("idEfeticacao", pTedTef.getIdEfetivacao());
        docData.put("status", pTedTef.getStatus());

        if(pTedTef.getPayloadTed() != null && pTedTef.getPayloadTed().getCodigoTipoTransacao() == 1) {

            docData.put("codigoFinalidade", pTedTef.getPayloadTed().getCodigoFinalidade());
            docData.put("codigoLiquidacao", pTedTef.getPayloadTed().getCodigoLiquidacao());
            docData.put("codigoSistemaOrigem", pTedTef.getPayloadTed().getCodigoSistemaOrigem());
            docData.put("codigoTipoContaFavorecido", pTedTef.getPayloadTed().getCodigoTipoContaFavorecido());
            docData.put("codigoTipoContaRemetente", pTedTef.getPayloadTed().getCodigoTipoContaRemetente());
            docData.put("codigoTipoTransacao", pTedTef.getPayloadTed().getCodigoTipoTransacao());
            docData.put("dataTransferencia", pTedTef.getPayloadTed().getDataTransferencia());
            docData.put("descricaoTransacao", pTedTef.getPayloadTed().getDescricaoTransacao());
            docData.put("idBancoFavorecido", pTedTef.getPayloadTed().getIdBancoFavorecido());
            docData.put("idBancoRementente", pTedTef.getPayloadTed().getIdBancoRemetente());
            docData.put("nomeFavorecido", pTedTef.getPayloadTed().getNomeFavorecido());
            docData.put("numeroAgenciaFavorecido", pTedTef.getPayloadTed().getNumeroAgenciaFavorecido());
            docData.put("numeroAgenciaRemetente", pTedTef.getPayloadTed().getNumeroAgenciaRemetente());
            docData.put("numeroContaFavorecido", pTedTef.getPayloadTed().getNumeroContaFavorecido());
            docData.put("numeroContaRemetente", pTedTef.getPayloadTed().getNumeroContaRemetente());
            docData.put("numeroCpfCnpjFavorecido", pTedTef.getPayloadTed().getNumeroCpfCnpjFavorecido());
            docData.put("salvarFavorecido", pTedTef.getPayloadTed().getSalvarFavorecido());
            docData.put("tipoPessoaFavorecido", pTedTef.getPayloadTed().getTipoPessoaFavorecido());
            docData.put("valorTransacao", pTedTef.getPayloadTed().getValorTransacao());

        } else {

            docData.put("codigoBancoFavorecido", pTedTef.getPayloadTef().getCodigoBancoFavorecido());
            docData.put("codigoBancoRemetente", pTedTef.getPayloadTef().getCodigoBancoRemetente());
            docData.put("codigoLiquidacao", pTedTef.getPayloadTef().getCodigoLiquidacao());
            docData.put("codigoSistemaOrigem", pTedTef.getPayloadTef().getCodigoSistemaOrigem());
            docData.put("codigoTipoContaFavorecido", pTedTef.getPayloadTef().getCodigoTipoContaFavorecido());
            docData.put("codigoTipoContaRemetente", pTedTef.getPayloadTef().getCodigoTipoContaRemetente());
            docData.put("codigoTipoTransacao", pTedTef.getPayloadTef().getCodigoTipoTransacao());
            docData.put("dataTransferencia", pTedTef.getPayloadTef().getDataTransferencia());
            docData.put("descricaoTransacao", pTedTef.getPayloadTef().getDescricaoTransacao());
            docData.put("numeroAgenciaFavorecido", pTedTef.getPayloadTef().getNumeroAgenciaFavorecido());
            docData.put("numeroAgenciaRemetente", pTedTef.getPayloadTef().getNumeroAgenciaRemetente());
            docData.put("numeroContaFavorecido", pTedTef.getPayloadTef().getNumeroContaFavorecido());
            docData.put("numeroContaRemetente", pTedTef.getPayloadTef().getNumeroContaRemetente());
            docData.put("salvarFavorecido", pTedTef.getPayloadTef().getSalvarFavorecido());
            docData.put("valorTransacao", pTedTef.getPayloadTef().getValorTransacao());
        }

        return resultadoApi(docData);
    }

    @Override
    public Boolean addBoleto(final Boleto pBoleto) {
        Map<String, Object> docData = new HashMap<>();
        docData.put("idTransacao", pBoleto.getIdTransacao());
        docData.put("idFraudes", pBoleto.getIdFraudes());
        docData.put("idEfeticacao", pBoleto.getIdEfetivacao());
        docData.put("status", pBoleto.getStatus());
        docData.put("contaOrigem", pBoleto.getPayloadBoleto().getContaOrigem());
        docData.put("bancoOrigem", pBoleto.getPayloadBoleto().getBancoOrigem());
        docData.put("bandeira", pBoleto.getPayloadBoleto().getCartaoSelecionado().getBandeira());
        docData.put("codigoTipo", pBoleto.getPayloadBoleto().getCartaoSelecionado().getCodigoTipo());
        docData.put("dataVencimento", pBoleto.getPayloadBoleto().getCartaoSelecionado().getDataVencimento());
        docData.put("ultimosDigitos", pBoleto.getPayloadBoleto().getCartaoSelecionado().getUltimosDigitos());
        docData.put("codigoBarras", pBoleto.getPayloadBoleto().getCodigoBarras());
        docData.put("codigoSistemaOrigem", pBoleto.getPayloadBoleto().getCodigoSistemaOrigem());
        docData.put("codigoTipoPagamento", pBoleto.getPayloadBoleto().getCodigoTipoPagamento());
        docData.put("dataEfetivacao", pBoleto.getPayloadBoleto().getDataEfetivacao());
        docData.put("formaPagamento", pBoleto.getPayloadBoleto().getFormaPagamento());
        docData.put("linhaDigitavel", pBoleto.getPayloadBoleto().getLinhaDigitavel());
        docData.put("valorPagamento", pBoleto.getPayloadBoleto().getValorPagamento());
        docData.put("valorPagamentoIOF", pBoleto.getPayloadBoleto().getValorPagamentoIOF());
        docData.put("nomeBeneficiario", pBoleto.getPayloadBoleto().getBeneficiario().getNomeBeneficiario());
        docData.put("documentoBeneficiario", pBoleto.getPayloadBoleto().getBeneficiario().getDocumentoBeneficiario());
        docData.put("tipoBeneficioario", pBoleto.getPayloadBoleto().getBeneficiario().getTipoBeneficioario());
        docData.put("nomeSacador", pBoleto.getPayloadBoleto().getSacadorAvalista().getNomeSacador());
        docData.put("documentoSacador", pBoleto.getPayloadBoleto().getSacadorAvalista().getDocumentoSacador());
        docData.put("tipoSacador", pBoleto.getPayloadBoleto().getSacadorAvalista().getTipoSacador());
        docData.put("nomePagador", pBoleto.getPayloadBoleto().getDadosDoPagador().getNomePagador());
        docData.put("documentoPagador", pBoleto.getPayloadBoleto().getDadosDoPagador().getDocumentoPagador());
        docData.put("tipoPagador", pBoleto.getPayloadBoleto().getDadosDoPagador().getTipoPagador());
        docData.put("idBanco", pBoleto.getPayloadBoleto().getDadosDoPagador().getContaPagador().getBanco().getIdBanco());
        docData.put("codigoBanco", pBoleto.getPayloadBoleto().getDadosDoPagador().getContaPagador().getBanco().getCodigoBanco());
        docData.put("nomeBanco", pBoleto.getPayloadBoleto().getDadosDoPagador().getContaPagador().getBanco().getNomeBanco());
        docData.put("agencia", pBoleto.getPayloadBoleto().getDadosDoPagador().getContaPagador().getAgencia());
        docData.put("conta", pBoleto.getPayloadBoleto().getDadosDoPagador().getContaPagador().getConta());
        docData.put("idEmissor", pBoleto.getPayloadBoleto().getEmissor().getIdEmissor());
        docData.put("codigoBancoEmissor", pBoleto.getPayloadBoleto().getEmissor().getCodigoBancoEmissor());
        docData.put("nomeEmissor", pBoleto.getPayloadBoleto().getEmissor().getNomeEmissor());

        return resultadoApi(docData);
    }

    private Boolean resultadoApi(final Map<String, Object> pDocData) {

        CollectionReference transacoesPix = firebase.getFirestore().collection("gestao-transacoes");
        ApiFuture<WriteResult> writeResultApiFuture = transacoesPix.document().create(pDocData);

        try {
            if (null != writeResultApiFuture.get()) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }
}
