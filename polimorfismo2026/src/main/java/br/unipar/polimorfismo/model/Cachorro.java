/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.polimorfismo.model;

/**
 *
 * @author andersonbosing
 */
public class Cachorro extends Animal {
    
    private String pelagem;

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    
    @Override
    public void respirar() {
        System.out.println("Cachorro respirando o ar puro da floresta");
    }
    
}
