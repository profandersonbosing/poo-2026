/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.aula;

/**
 *
 * @author andersonbosing
 */
public class Aula0503 {

    public static void main(String[] args) {
        
        /*
        Escreva um código em Java que apresente a classe Retângulo, 
        com atributos comprimento, largura, área e perímetro e, 
        os métodos calcularArea, calcularPerimetro e imprimir.
        Os métodos calculareArea e calcularPerimetro deve realizar 
        o cálculo da área e perímetro respectivamente e deve 
        atribuir os resultados dos cálculos aos respectivos 
        atributos.

        O método imprimir deverá retornar através de uma mensagem 
        ao usuário no console(System.out) os valores de todos os 
        atributos.

        Na classe principal do programa java deve-se criar um 
        objeto do tipo Retângulo setar os atributos necessários e 
        chamar os métodos de cálculo ao final deve-se chamar o 
        método de impressão para que seja retornado o resultado.
        */
        
        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(2);
        retangulo.setLargura(5);
        retangulo.imprimir();
        
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.imprimir();
        
    }
}
