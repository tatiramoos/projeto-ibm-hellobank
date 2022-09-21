package br.com.hellobank.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.Models.Endereco;
import br.com.hellobank.Repository.EnderecoRepository;

@Service
public class EnderecoServiceImpl implements IEnderecoService {

    @Autowired
    private EnderecoRepository repo;

    @Override
    public Endereco cadastrarEndereco(Endereco novo) {
        return repo.save(novo);
    }

    @Override
    public ArrayList<Endereco> listarEndereco() {
        return (ArrayList<Endereco>) repo.findAll();
    }

    @Override
    public Endereco atualizarEndereco(Endereco dados) {
        return null;
    }


    @Override
    public Endereco buscarEndereco(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deletarEndereco(Integer id) {
        repo.deleteById(id);
    }
    
}
