package br.com.hellobank.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.Models.Conta;
import br.com.hellobank.Repository.ContaRepository;

@Service
public class ContaServiceImpl implements IContaService {

    @Autowired
    private ContaRepository repo;

    @Override
    public Conta cadastrarConta(Conta novo) {
        return repo.save(novo);
    }

    @Override
    public ArrayList<Conta> listarConta() {
        return (ArrayList<Conta>) repo.findAll();
    }

    @Override
    public Conta atualizarConta(Conta dados) {
        if (dados.getId() != null && dados.getConta() != null){
            return repo.save(dados);
        }
        return null;
    }

    @Override
    public Conta buscarConta(Integer Id) {
        return repo.findById(Id).orElse(null);
    }

    @Override
    public void deletarConta(Integer Id) {
        repo.deleteById(Id);
    }
    
}
