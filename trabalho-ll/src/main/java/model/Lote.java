/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Walis
 */
public class Lote {
    private int id;
    
    private Produto produto;
    
    private LocalDate dataEntrada;
    
    private LocalDate dataValidade;
    
    private int quantidade;

    public Lote(int id, Produto produto, LocalDate dataEntrada, LocalDate dataValidade, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.dataEntrada = dataEntrada;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
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

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public boolean estaVencido(){
        return dataValidade.isBefore(LocalDate.now());
    }
    
    public boolean estaProximoVencimento(){
        LocalDate hoje = LocalDate.now();
        return !dataValidade.isBefore(hoje) && dataValidade.isBefore(hoje.plusDays(7));
    }
   
}
