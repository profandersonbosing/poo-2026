/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.primeira.aula.poo;

import br.unipar.primeira.aula.poo.model.Professor;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author andersonbosing
 */
public class PrimeiraAulaPoo {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno(); //instanciando um 
        aluno.nome = "Anderson";
        aluno.ra = "17221";
        aluno.idade = 32;
        aluno.telefone = "(45) 98908908";
        
        Aluno aluno2 = new Aluno(); //instanciando outro objeto
        aluno2.cpf = "578293847598723894";
        aluno2.idade = 11;
        aluno2.ra = "4324234234";
        aluno2.nome = "Teste";
        
        System.out.println("Nome do aluno é " + aluno.nome);
        System.out.println("Nome do aluno é " + aluno2.nome);
        
        
        String result = JOptionPane.showInputDialog("Informe o nome:");
        String idade = JOptionPane.showInputDialog("Informe o Idade:");
        
        Professor professor = new Professor();
        professor.setNome(result);
        professor.setIdade(Integer.valueOf(idade));
        
        
        JOptionPane.showMessageDialog(null, "Nome do professor é " + professor.getNome());
        
        
        
    }
}
