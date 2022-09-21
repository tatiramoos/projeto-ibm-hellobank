package br.com.hellobank.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idcli")
    private String id;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    @Column(name = "nome", length=50, nullable=false)
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "email", length=50, nullable=false, unique=true  )
    private String email;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    @Column(name = "telefone", length=20, nullable=false, unique=true)
    private String telefone;

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Column(name = "cpf", length=20, nullable = false, unique=true)
    private String cpf;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
}
