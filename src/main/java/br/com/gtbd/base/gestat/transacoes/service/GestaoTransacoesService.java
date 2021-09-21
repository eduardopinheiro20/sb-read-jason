package br.com.gtbd.base.gestat.transacoes.service;

import br.com.gtbd.base.gestat.transacoes.domain.Boleto;
import br.com.gtbd.base.gestat.transacoes.domain.Pix;
import br.com.gtbd.base.gestat.transacoes.domain.Ted;
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



        CollectionReference transacoesPix = firebase.getFirestore().collection("gestao-transacoes");
        ApiFuture<WriteResult> writeResultApiFuture = transacoesPix.document().create(docData);

        try {
            if (null != writeResultApiFuture.get()) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean addTed(final Ted pTed) {
        return null;
    }

    @Override
    public Boolean addBoleto(final Boleto pBoleto) {
        return null;
    }
}
