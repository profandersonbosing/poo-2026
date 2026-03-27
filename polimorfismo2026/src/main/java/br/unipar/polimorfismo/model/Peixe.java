/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.polimorfismo.model;

/**
 *
 * @author andersonbosing
 */
public class Peixe extends Animal {
    
    private String tipoDeAgua;

    public String getTipoDeAgua() {
        return tipoDeAgua;
    }

    public void setTipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }
    
    @Override
    public void respirar() {
        System.out.println("Peixe respirando no fundo do oceano");
    }
    
}
