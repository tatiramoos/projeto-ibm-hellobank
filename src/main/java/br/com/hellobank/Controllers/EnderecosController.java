package br.com.hellobank.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hellobank.Models.Endereco;
import br.com.hellobank.Service.IEnderecoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping(value = "/endereco")
@RestController
public class EnderecosController {

    @Autowired
    private IEnderecoService service;


    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Endereco> novoEndereco(@RequestBody Endereco novo) {
        Endereco res = service.cadastrarEndereco(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();

    }

    @GetMapping("/listar")
    public ArrayList<Endereco> buscaEnderecos() {
        return (ArrayList<Endereco>) service.listarEndereco();
    }

    @PutMapping(value = "atualizar")
    public ResponseEntity <Endereco> alterarCliente(@RequestBody Endereco dados) {
      Endereco res = service.atualizarEndereco(dados);
      if (dados != null) {
        return ResponseEntity.ok(res);
      }
      return ResponseEntity.badRequest().build();

    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Endereco> buscarEndereco(@PathVariable Integer id) {
        Endereco res = service.buscarEndereco(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
        }

    @DeleteMapping("/deletar")
    public ResponseEntity<Endereco> excluirCliente(@PathVariable Integer id){
        service.deletarEndereco(id);
            return ResponseEntity.ok(null);
    }
    
    }
    
