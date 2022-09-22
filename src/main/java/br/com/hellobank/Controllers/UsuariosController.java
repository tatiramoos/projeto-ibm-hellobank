package br.com.hellobank.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hellobank.Models.Usuario;
import br.com.hellobank.Service.IUsuarioService;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping(path="/usuarios")
@RestController
public class UsuariosController {

    @Autowired
    private IUsuarioService service;

    
    @GetMapping("/listar")
    @ApiOperation(value = "Lista todos os usuários")
    public ArrayList<Usuario> buscaUsuario() {
        return service.listarUsuario();
    }


    @PostMapping(value = "/cadastrar")
    @ApiOperation(value = "Cadastra um novo usuário")
    public ResponseEntity<Usuario> novoCliente(@RequestBody Usuario novo) {
        Usuario res = service.cadastrarUsuario(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();

    }


    @PutMapping(value = "atualizar")
    @ApiOperation(value = "Atualiza os dados de um usuário")
    public ResponseEntity <Usuario> alterarCliente(@RequestBody Usuario dados) {
      Usuario res = service.atualizarUsuario(dados);
      if (dados != null) {
        return ResponseEntity.ok(res);
      }
      return ResponseEntity.badRequest().build();

    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Busca um único usuário")
    public ResponseEntity<Usuario> buscarID(@PathVariable Integer id) {
        Usuario res = service.buscarUsuario(id);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
        }

    @DeleteMapping("/deletar")
    @ApiOperation(value = "Deleta um usuário")
    public ResponseEntity<Usuario> excluirCliente(@PathVariable Integer id){
        service.deletarUsuario(id);
            return ResponseEntity.ok(null);
    }
    
    }
