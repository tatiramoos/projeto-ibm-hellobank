package br.com.hellobank.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.hellobank.Models.Transacao;
import br.com.hellobank.Service.ITransacaoService;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping(value = "/transacoes")
@RestController
public class TransacoesController {

    @Autowired
    private ITransacaoService service;


    @GetMapping("/listar")
    @ApiOperation(value = "Lista todas as transações")
    public ArrayList<Transacao> listarTrans() {
        return service.listarTransacao();
    }

    @PostMapping(value = "/cadastrar")
    @ApiOperation(value = "Cadastra uma nova transação")
    public ResponseEntity<Transacao> novaTransacao(@RequestBody Transacao novo) {
        Transacao res = service.cadastrarTransacao(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }


    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Busca uma única transação")
    public ResponseEntity<Transacao> buscarTransacao(@PathVariable Integer id) {
        Transacao res = service.buscarTransacao(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
        }

    @DeleteMapping("/deleta/{id}")
    @ApiOperation(value = "Deleta uma transação")
    public ResponseEntity<Transacao> deletarTrans(@PathVariable Integer id){
        service.deletarTransacao(id);
            return ResponseEntity.ok(null);
    }
    
    }