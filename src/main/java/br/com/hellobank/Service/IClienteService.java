package br.com.hellobank.Service;

import java.util.ArrayList;

import br.com.hellobank.Models.Cliente;

public interface IClienteService {
    public Cliente cadastrarCliente(Cliente novo);
    public ArrayList<Cliente> listarClientes();
    public Cliente atualizarCliente (Cliente dados);
    public Cliente buscarID(Integer Id);
    public void deletarCliente (Integer Id);
}
