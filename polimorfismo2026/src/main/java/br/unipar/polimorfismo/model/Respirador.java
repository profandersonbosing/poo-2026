/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.polimorfismo.model;

/**
 *
 * @author andersonbosing
 */
public class Respirador {
    
    public void executarRespiracao(Animal animal) {
        animal.respirar();
        
        if (animal instanceof Cachorro) {
            System.out.println("É um cachorro");
        }
        
        if (animal instanceof Peixe) {
            System.out.println("É um peixe");
        }
    }
    
}
