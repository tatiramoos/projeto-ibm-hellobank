package br.com.hellobank.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hellobank.Models.Cliente;
import br.com.hellobank.Repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository repo;
    
    @Override
    public Cliente cadastrarCliente(Cliente novo) {
        return repo.save(novo);
    }

    @Override
    public ArrayList<Cliente> listarClientes() {
        return (ArrayList<Cliente>) repo.findAll();
    }

    @Override
    public Cliente atualizarCliente(Cliente dados) {
        if (dados.getId() != null && dados.getNome() != null){
            return repo.save(dados);
        }
        return null;
    }

    @Override
    public Cliente buscarID(Integer Id) {
        return repo.findById(Id).orElse(null);
    }

    @Override
    public void deletarCliente(Integer Id) {
        repo.deleteById(Id);
    }


    
}
