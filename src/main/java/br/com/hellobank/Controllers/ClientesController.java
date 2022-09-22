package br.com.hellobank.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hellobank.Models.Cliente;
import br.com.hellobank.Service.IClienteService;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping(value = "/clientes")
@RestController
public class ClientesController {

    @Autowired
    private IClienteService service;

    @GetMapping("/listar")
    @ApiOperation(value = "Lista todos os clientes")
    public ArrayList<Cliente> buscaClientes() {
        return service.listarClientes();
    }

    @PostMapping(value = "/cadastrar")
    @ApiOperation(value = "Cadastra um cliente")
    public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente novo) {
        Cliente res = service.cadastrarCliente(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();

    }

    @PutMapping(value = "atualizar")
    @ApiOperation(value = "Atualiza os dados de um cliente")
    public ResponseEntity <Cliente> alterarCliente(@RequestBody Cliente dados) {
      Cliente res = service.atualizarCliente(dados);
      if (dados != null) {
        return ResponseEntity.ok(res);
      }
      return ResponseEntity.badRequest().build();

    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Busca um único cliente")
    public ResponseEntity<Cliente> buscarID(@PathVariable Integer id) {
        Cliente res = service.buscarID(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
        }

    @DeleteMapping("/deletar/{id}")
    @ApiOperation(value = "Deleta um cliente")
    public ResponseEntity<Cliente> excluirCliente(@PathVariable Integer id){
        service.deletarCliente(id);
            return ResponseEntity.ok(null);
    }
    
    }
    
