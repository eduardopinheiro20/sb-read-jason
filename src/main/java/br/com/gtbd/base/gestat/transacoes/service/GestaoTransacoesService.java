package br.com.gtbd.base.gestat.transacoes.service;

import br.com.gtbd.base.gestat.transacoes.domain.Boleto;
import br.com.gtbd.base.gestat.transacoes.domain.Pix;
import br.com.gtbd.base.gestat.transacoes.domain.Ted;
import br.com.gtbd.base.gestat.transacoes.domain.Tef;
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
    public Boolean addTed(final Ted pTed) {

        Map<String, Object> docData = new HashMap<>();
        docData.put("idTransacao", pTed.getIdTransacao());
        docData.put("idFraudes", pTed.getIdFraudes());
        docData.put("idEfeticacao", pTed.getIdEfetivacao());
        docData.put("status", pTed.getStatus());
        docData.put("codigoFinalidade", pTed.getPayloadTed().getCodigoFinalidade());
        docData.put("codigoLiquidacao", pTed.getPayloadTed().getCodigoLiquidacao());
        docData.put("codigoSistemaOrigem", pTed.getPayloadTed().getCodigoSistemaOrigem());
        docData.put("codigoTipoContaFavorecido", pTed.getPayloadTed().getCodigoTipoContaFavorecido());
        docData.put("codigoTipoContaRementente", pTed.getPayloadTed().getCodigoTipoContaRementente());
        docData.put("codigoTipoTransacao", pTed.getPayloadTed().getCodigoTipoTransacao());
        docData.put("dataTransferencia", pTed.getPayloadTed().getDataTransferencia());
        docData.put("descricaoTransacao", pTed.getPayloadTed().getDescricaoTransacao());
        docData.put("indentificadorBancoFavorecido", pTed.getPayloadTed().getIndentificadorBancoFavorecido());
        docData.put("identificadorBancoRementente", pTed.getPayloadTed().getIdentificadorBancoRementente());
        docData.put("nomeFavorecido", pTed.getPayloadTed().getNomeFavorecido());
        docData.put("numeroAgenciaFavorecido", pTed.getPayloadTed().getNumeroAgenciaFavorecido());
        docData.put("numeroAgenciaRemetente", pTed.getPayloadTed().getNumeroAgenciaRemetente());
        docData.put("numeroContaFavorecido", pTed.getPayloadTed().getNumeroContaFavorecido());
        docData.put("numeroContaRemetente", pTed.getPayloadTed().getNumeroContaRemetente());
        docData.put("numeroCpfCnpjFavorecido", pTed.getPayloadTed().getNumeroCpfCnpjFavorecido());
        docData.put("salvarFavorecido", pTed.getPayloadTed().getSalvarFavorecido());
        docData.put("tipoPessoaFavorecido", pTed.getPayloadTed().getTipoPessoaFavorecido());
        docData.put("valorTransacao", pTed.getPayloadTed().getValorTransacao());

        return resultadoApi(docData);

    }

    @Override
    public Boolean addTef(final Tef pTef) {
        Map<String, Object> docData = new HashMap<>();
        docData.put("idTransacao", pTef.getIdTransacao());
        docData.put("idFraudes", pTef.getIdFraudes());
        docData.put("idEfeticacao", pTef.getIdEfetivacao());
        docData.put("status", pTef.getStatus());
        docData.put("codigoBancoFavorecido", pTef.getPayloadTef().getCodigoBancoFavorecido());
        docData.put("codigoBancoRemetente", pTef.getPayloadTef().getCodigoBancoRemetente());
        docData.put("codigoLiquidacao", pTef.getPayloadTef().getCodigoLiquidacao());
        docData.put("codigoSistemaOrigem", pTef.getPayloadTef().getCodigoSistemaOrigem());
        docData.put("codigoTipoContaFavorecido", pTef.getPayloadTef().getCodigoTipoContaFavorecido());
        docData.put("codigoTipoContaRementente", pTef.getPayloadTef().getCodigoTipoContaRementente());
        docData.put("codigoTipoTransacao", pTef.getPayloadTef().getCodigoTipoTransacao());
        docData.put("dataTransferencia", pTef.getPayloadTef().getDataTransferencia());
        docData.put("descricaoTransacao", pTef.getPayloadTef().getDescricaoTransacao());
        docData.put("numeroAgenciaFavorecido", pTef.getPayloadTef().getNumeroAgenciaFavorecido());
        docData.put("numeroAgenciaRemetente", pTef.getPayloadTef().getNumeroAgenciaRemetente());
        docData.put("numeroContaFavorecido", pTef.getPayloadTef().getNumeroContaFavorecido());
        docData.put("numeroContaRemetente", pTef.getPayloadTef().getNumeroContaRemetente());
        docData.put("salvarFavorecido", pTef.getPayloadTef().getSalvarFavorecido());
        docData.put("valorTransacao", pTef.getPayloadTef().getValorTransacao());

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
        docData.put("codigoBarra", pBoleto.getPayloadBoleto().getCodigoBarra());
        docData.put("codigoSitemaOrigem", pBoleto.getPayloadBoleto().getCodigoSitemaOrigem());
        docData.put("codigoTipoPagamento", pBoleto.getPayloadBoleto().getCodigoTipoPagamento());
        docData.put("dataEfeticacao", pBoleto.getPayloadBoleto().getDataEfeticacao());
        docData.put("formaPagamento", pBoleto.getPayloadBoleto().getFormaPagamento());
        docData.put("linhaDigitavel", pBoleto.getPayloadBoleto().getLinhaDigitavel());
        docData.put("valorPagamento", pBoleto.getPayloadBoleto().getValorPagamento());
        docData.put("valorpagamentoIOF", pBoleto.getPayloadBoleto().getValorpagamentoIOF());
        docData.put("nomeBeneficiario", pBoleto.getPayloadBoleto().getBeneficiario().getNomeBeneficiario());
        docData.put("documentoBeneficiario", pBoleto.getPayloadBoleto().getBeneficiario().getDocumentoBeneficiario());
        docData.put("tipoBeneficioario", pBoleto.getPayloadBoleto().getBeneficiario().getTipoBeneficioario());
        docData.put("nomeSacador", pBoleto.getPayloadBoleto().getSacadorAvalista().getNomeSacador());
        docData.put("documentoSacador", pBoleto.getPayloadBoleto().getSacadorAvalista().getDocumentoSacador());
        docData.put("tipoSacador", pBoleto.getPayloadBoleto().getSacadorAvalista().getTipoSacador());
        docData.put("nomePagador", pBoleto.getPayloadBoleto().getDadosPagdor().getNomePagador());
        docData.put("documentoPagador", pBoleto.getPayloadBoleto().getDadosPagdor().getDocumentoPagador());
        docData.put("tipoPagador", pBoleto.getPayloadBoleto().getDadosPagdor().getTipoPagador());
        docData.put("idBanco", pBoleto.getPayloadBoleto().getDadosPagdor().getContaPagador().getBanco().getIdBanco());
        docData.put("codigoBanco", pBoleto.getPayloadBoleto().getDadosPagdor().getContaPagador().getBanco().getCodigoBanco());
        docData.put("nomeBanco", pBoleto.getPayloadBoleto().getDadosPagdor().getContaPagador().getBanco().getNomeBanco());
        docData.put("agencia", pBoleto.getPayloadBoleto().getDadosPagdor().getContaPagador().getAgencia());
        docData.put("conta", pBoleto.getPayloadBoleto().getDadosPagdor().getContaPagador().getConta());
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
