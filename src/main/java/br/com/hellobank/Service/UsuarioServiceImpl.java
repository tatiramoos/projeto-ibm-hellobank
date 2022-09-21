package br.com.hellobank.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.Models.Usuario;
import br.com.hellobank.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    
    @Autowired
    private UsuarioRepository repo;

    @Override
    public Usuario cadastrarUsuario(Usuario novo) {
        return repo.save(novo);
    }

    @Override
    public ArrayList<Usuario> listarUsuario() {
        return (ArrayList<Usuario>) repo.findAll();
    }

    @Override
    public Usuario buscarUsuario(Integer id) {
        return repo.findById(id).orElse(null);
    }

    

    @Override
    public Usuario atualizarUsuario(Usuario dados) {
        if (dados.getId() != null && dados.getSenha() != null){
            return repo.save(dados);
        }
        return null;
    }

    @Override
    public void deletarUsuario(Integer id) {
        repo.deleteById(id);   
    }
    
}
