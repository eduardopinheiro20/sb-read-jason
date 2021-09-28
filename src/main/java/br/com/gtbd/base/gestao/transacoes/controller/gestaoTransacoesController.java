package br.com.gtbd.base.gestao.transacoes.controller;

import br.com.gtbd.base.gestao.transacoes.domain.Boleto;
import br.com.gtbd.base.gestao.transacoes.domain.GestaoTransacoes;
import br.com.gtbd.base.gestao.transacoes.domain.Pix;
import br.com.gtbd.base.gestao.transacoes.domain.TedTef;
import br.com.gtbd.base.gestao.transacoes.service.GestaoTransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class gestaoTransacoesController {

    @Autowired
    private GestaoTransacoesService gestaoTransacaoService;

    @GetMapping("/list")
    public ResponseEntity list() {
        return  new ResponseEntity(gestaoTransacaoService.listTransacoes(), HttpStatus.OK);
    }

    @PostMapping("/pix")
    public ResponseEntity addPix(@RequestBody Pix pPix) {
        return new ResponseEntity(gestaoTransacaoService.addPix(pPix), HttpStatus.OK);
    }

    @PostMapping("/ted")
    public ResponseEntity addTed(@RequestBody TedTef pTedTef) {
        return new ResponseEntity(gestaoTransacaoService.addTedTef(pTedTef), HttpStatus.OK);
    }

    @PostMapping("/boleto")
    public ResponseEntity addBoleto(@RequestBody Boleto pBoleto) {
        return new ResponseEntity(gestaoTransacaoService.addBoleto(pBoleto), HttpStatus.OK);
    }

    @PutMapping("/{id}/atualizarProtocoloFraudes")
    public ResponseEntity update(@PathVariable(value = "id") String id, @RequestBody GestaoTransacoes pTransacoes) {
        return new ResponseEntity(gestaoTransacaoService.atualizarProtocoloFraudes(id, pTransacoes), HttpStatus.OK);
    }

    @DeleteMapping("/{id}/excluir")
    public  ResponseEntity excluir(@PathVariable(value = "id")String id) {
        return  new ResponseEntity(gestaoTransacaoService.deleteTransacao(id), HttpStatus.OK);
    }

}
