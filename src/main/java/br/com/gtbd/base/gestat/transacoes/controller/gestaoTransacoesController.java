package br.com.gtbd.base.gestat.transacoes.controller;

import br.com.gtbd.base.gestat.transacoes.domain.Boleto;
import br.com.gtbd.base.gestat.transacoes.domain.Pix;
import br.com.gtbd.base.gestat.transacoes.domain.Ted;
import br.com.gtbd.base.gestat.transacoes.service.GestaoTransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.table.TableCellEditor;

@RestController
@RequestMapping("/api")
public class gestaoTransacoesController {

    @Autowired
    private GestaoTransacoesService gestaoTransacaoService;

    @PostMapping("/pix")
    public ResponseEntity addPix(@RequestBody Pix pPix) {
        return new ResponseEntity(gestaoTransacaoService.addPix(pPix), HttpStatus.OK);
    }

    @PostMapping("/ted")
    public ResponseEntity addTed(@RequestBody Ted pTed) {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping("/boleto")
    public ResponseEntity addBoleto(@RequestBody Boleto pBoleto) {
        return new ResponseEntity(null, HttpStatus.OK);
    }


}
