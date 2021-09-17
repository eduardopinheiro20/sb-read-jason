package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.service;

import com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain.Pix;
import com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.repository.GestaoTransacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestaoTransacoesService {

    @Autowired
    private GestaoTransacoesRepository gestaoTransacoesRepository;

    public Iterable<Pix> list() {
        return gestaoTransacoesRepository.findAll();
    }

    public Pix save(Pix transacaoPix ) {
        return gestaoTransacoesRepository.save(transacaoPix);
    }

    public Iterable<Pix> save(List<Pix> transacaoPix ) {
        return gestaoTransacoesRepository.saveAll(transacaoPix);
    }

}
