/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.loja.carros.model;

/**
 *
 * @author andersonbosing
 */
public class Carro {
    
    private Integer id;
    
    private Integer ano;
    
    private String nrChassi;
    
    private String cor;
    
    private Marca marca;
    
    private Modelo modelo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNrChassi() {
        return nrChassi;
    }

    public void setNrChassi(String nrChassi) {
        this.nrChassi = nrChassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", ano=" + ano + ", nrChassi=" + nrChassi + ", cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
}
