/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.calculadora.bonus;

import br.unipar.calculadora.bonus.model.Diretor;
import br.unipar.calculadora.bonus.model.Funcionario;
import br.unipar.calculadora.bonus.model.Gerente;
import br.unipar.calculadora.bonus.utils.CalculadoraBonus;

/**
 *
 * @author andersonbosing
 */
public class CalculadoraBonus2026 {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setId(1);
        funcionario.setNome("Jose");
        funcionario.setSalario(2000.0);
        
        Gerente gerente = new Gerente();
        gerente.setId(2);
        gerente.setNome("Carlos");
        gerente.setSalario(10000.0);
        
        Diretor diretor = new Diretor();
        diretor.setId(3);
        diretor.setNome("Robson");
        diretor.setSalario(20000.0);
        
        CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
        calculadoraBonus.calcular(funcionario);
        calculadoraBonus.calcular(gerente);
        calculadoraBonus.calcular(diretor);
        
    }
}
