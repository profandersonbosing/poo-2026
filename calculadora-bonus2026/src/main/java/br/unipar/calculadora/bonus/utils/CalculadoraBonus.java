/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.calculadora.bonus.utils;

import br.unipar.calculadora.bonus.model.Diretor;
import br.unipar.calculadora.bonus.model.Funcionario;
import br.unipar.calculadora.bonus.model.Gerente;

/**
 *
 * @author andersonbosing
 */
public class CalculadoraBonus {
    
    public void calcular(Funcionario funcionario) {
        
        Double salarioComBonus = 1.0;
        
        if (funcionario instanceof Gerente) {
            salarioComBonus = funcionario.getSalario() * 1.20;
        } else if (funcionario instanceof Diretor) {
            salarioComBonus = funcionario.getSalario() * 1.50;
        } else {
            salarioComBonus = funcionario.getSalario() * 1.10;
        }
        
        System.out.println("Salario do funcionario " 
                + funcionario.getNome() + " é "+salarioComBonus);
        
    }
    
}
