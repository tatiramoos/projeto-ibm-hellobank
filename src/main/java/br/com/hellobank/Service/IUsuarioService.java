package br.com.hellobank.Service;

import java.util.ArrayList;

import br.com.hellobank.Models.Usuario;

public interface IUsuarioService {
    public Usuario cadastrarUsuario(Usuario novo);
    public Usuario buscarUsuario(Integer id);
    public ArrayList<Usuario> listarUsuario();
    public Usuario atualizarUsuario(Usuario user);
    public void deletarUsuario(Integer id);
}
