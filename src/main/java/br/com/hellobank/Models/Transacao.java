package br.com.hellobank.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transacoes")
public class Transacao {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtrans")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Column(name = "numbanco")
    private Integer numbanco;

    public Integer getNumbanco() {
        return numbanco;
    }

    public void setNumbanco(Integer numbanco) {
        this.numbanco = numbanco;
    }


    @Column(name = "contadepo")
    private Integer contadepo;

    public Integer getContadepo() {
        return contadepo;
    }

    public void setContadepo(Integer contadepo) {
        this.contadepo = contadepo;
    }

    
    @Column(name = "contabene")
    private Integer contabene;

    public Integer getContabene() {
        return contabene;
    }

    public void setContabene(Integer contabene) {
        this.contabene = contabene;
    }

    
    @Column(name = "valortrans")
    private double valorTrans;

    public double getValorTrans() {
        return valorTrans;
    }

    public void setValorTrans(double valorTrans) {
        this.valorTrans = valorTrans;
    }


    @Column(name = "datatrans", length = 10)
    private String dataTrans;

    public String getDataTrans() {
        return dataTrans;
    }

    public void setDataTrans(String dataTrans) {
        this.dataTrans = dataTrans;
    }


}
