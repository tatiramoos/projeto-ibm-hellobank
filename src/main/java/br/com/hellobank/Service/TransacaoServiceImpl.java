package br.com.hellobank.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.Models.Transacao;
import br.com.hellobank.Repository.TransacaoRepository;

@Service
public class TransacaoServiceImpl implements ITransacaoService {

    @Autowired
    private TransacaoRepository repo;

    @Override
    public Transacao cadastrarTransacao(Transacao novo) {
        return repo.save(novo);
    }

    @Override
    public Transacao buscarTransacao(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public ArrayList<Transacao> listarTransacao() {
        return (ArrayList<Transacao>) repo.findAll();
    }

    @Override
    public void deletarTransacao(Integer id) {
        repo.deleteById(id);
        
    }

    

}
