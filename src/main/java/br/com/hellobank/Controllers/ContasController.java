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
import io.swagger.annotations.ApiOperation;

@RequestMapping(value = "/contas")
@RestController
public class ContasController {
    

    @Autowired
    private IContaService service;


    @GetMapping("/listar")
    @ApiOperation(value = "Lista todas as contas")
    public ArrayList<Conta> buscaEnderecos() {
        return (ArrayList<Conta>) service.listarConta();
    }

    
    @PostMapping(value = "/cadastrar")
    @ApiOperation(value = "Cadastra uma conta")
    public ResponseEntity<Conta> novaConta(@RequestBody Conta novo) {
        Conta res = service.cadastrarConta(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();

    }


    @PutMapping(value = "atualizar")
    @ApiOperation(value = "Atualiza os dados de uma conta")
    public ResponseEntity <Conta> alterarConta(@RequestBody Conta dados) {
      Conta res = service.atualizarConta(dados);
      if (dados != null) {
        return ResponseEntity.ok(res);
      }
      return ResponseEntity.badRequest().build();

    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Busca uma única conta")
    public ResponseEntity<Conta> buscarEndereco(@PathVariable Integer id) {
        Conta res = service.buscarConta(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
        }

    @DeleteMapping("/deletar")
    @ApiOperation(value = "Deleta uma conta")
    public ResponseEntity<Conta> excluirCliente(@PathVariable Integer id){
        service.deletarConta(id);
            return ResponseEntity.ok(null);
    }
    
}
