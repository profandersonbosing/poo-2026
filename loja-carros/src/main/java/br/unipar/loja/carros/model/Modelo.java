/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.loja.carros.model;

/**
 *
 * @author andersonbosing
 */
public class Modelo {
    
    private Integer id;
    
    private String nome;
    
    private Double velocidadeMaxima;
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public Double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", nome=" + nome + ", velocidadeMaxima=" + velocidadeMaxima + '}';
    }
}
