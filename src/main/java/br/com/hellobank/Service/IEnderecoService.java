package br.com.hellobank.Service;

import java.util.List;

import br.com.hellobank.Models.Endereco;

public interface IEnderecoService {

    public Endereco cadastrarEndereco(Endereco address);
    public List<Endereco> listarEndereco();
    public Endereco atualizarEndereco(Endereco address);
    public Endereco buscarEndereco(Integer id);
    public void deletarEndereco(Integer id);
}

