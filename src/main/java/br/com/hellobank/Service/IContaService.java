package br.com.hellobank.Service;

import java.util.ArrayList;

import br.com.hellobank.Models.Conta;

public interface IContaService {
    public Conta cadastrarConta(Conta novo);
    public ArrayList<Conta> listarConta();
    public Conta atualizarConta(Conta dados);
    public Conta buscarConta(Integer Id);
    public void deletarConta(Integer Id);

}
