package br.com.hellobank.Service;

import java.util.ArrayList;

import br.com.hellobank.Models.Transacao;

public interface ITransacaoService {
    public Transacao cadastrarTransacao(Transacao novo);
    public Transacao buscarTransacao(Integer id);
    public ArrayList<Transacao> listarTransacao();
    public void deletarTransacao(Integer id);
}
 