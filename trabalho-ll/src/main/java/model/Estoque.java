/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Walis
 */
public class Estoque {
    
    private int id;
    
    private Produto produto;
    
    private int quantidadeAtual;

    public Estoque(int id, Produto produto, int quantidadeAtual) {
        this.id = id;
        this.produto = produto;
        this.quantidadeAtual = quantidadeAtual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    
}
