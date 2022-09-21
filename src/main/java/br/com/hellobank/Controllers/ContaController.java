package br.com.hellobank.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hellobank.Models.Conta;
import br.com.hellobank.Service.IContaService;

@RequestMapping(value = "/conta")
@RestController
public class ContaController {
    

    @Autowired
    private IContaService service;


    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Conta> novaConta(@RequestBody Conta novo) {
        Conta res = service.cadastrarConta(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();

    }

    @GetMapping("/listar")
    public ArrayList<Conta> buscaEnderecos() {
        return (ArrayList<Conta>) service.listarConta();
    }

    @PutMapping(value = "atualizar")
    public ResponseEntity <Conta> alterarConta(@RequestBody Conta dados) {
      Conta res = service.atualizarConta(dados);
      if (dados != null) {
        return ResponseEntity.ok(res);
      }
      return ResponseEntity.badRequest().build();

    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Conta> buscarEndereco(@PathVariable Integer id) {
        Conta res = service.buscarConta(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
        }

    @DeleteMapping("/deletar")
    public ResponseEntity<Conta> excluirCliente(@PathVariable Integer id){
        service.deletarConta(id);
            return ResponseEntity.ok(null);
    }
    
}
