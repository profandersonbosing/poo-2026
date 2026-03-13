/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.unibanco.models;

import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */
public class Agencia {
    
    private Integer id;
    
    private String nome;
    
    private ArrayList<Correntista> correntista = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Correntista> getCorrentista() {
        return correntista;
    }

    public void setCorrentista(ArrayList<Correntista> correntista) {
        this.correntista = correntista;
    }
    
    public void addCorrentista(Correntista correntista) {
        this.correntista.add(correntista);
    }

    @Override
    public String toString() {
        return "Agencia{" + "id=" + id + ", nome=" + nome + ", correntista=" + correntista + '}';
    }
    
}
