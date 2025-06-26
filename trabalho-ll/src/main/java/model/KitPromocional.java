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
public class KitPromocional {
    private int id;
    private String nome;
    private List<Produto> produtos;
    private double precoPromocional;

    public KitPromocional(int id, String nome, List<Produto> produtos, double precoPromocional) {
        this.id = id;
        this.nome = nome;
        this.produtos = produtos;
        this.precoPromocional = precoPromocional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
    
    
    
}
