/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class Veiculo {
    
    private Integer id;
    
    private String nrChassi;
    
    private String cor;
    
    private String rg;

    public Veiculo(Integer id, String nrChassi, String cor) {
        this.id = id;
        this.nrChassi = nrChassi;
        this.cor = cor;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", nrChassi=" + nrChassi + ", cor=" + cor + '}';
    }
}
