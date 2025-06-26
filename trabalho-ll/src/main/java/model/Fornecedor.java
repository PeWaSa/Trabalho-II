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
public class Fornecedor {
    private int id; 
    private String nomeEntregador;

    public Fornecedor(int id, String nomeEntregador) {
        this.id = id;
        this.nomeEntregador = nomeEntregador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }
    
}
