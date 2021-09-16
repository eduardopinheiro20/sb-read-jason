package com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.controller;

import com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.domain.Pix;
import com.atom.gestao.transacoes.sbgtbdbaseatomgestaotransacoes.service.GestaoTransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class gestaoTransacoesController {

    @Autowired
    private GestaoTransacoesService gestaoTransacaoService;

    @GetMapping("/pix")
    public Iterable<Pix> list() {
        return gestaoTransacaoService.list();

    }



}
