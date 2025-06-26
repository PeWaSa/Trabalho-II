/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
/**
 *
 * @author Walis
 */
public class Entrega {
    private String nome;
    private String cnpj;
    private List<Produto> produto;

    public Entrega(String nome, String cnpj, List<Produto> produto) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produto = produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    
    
    
}
