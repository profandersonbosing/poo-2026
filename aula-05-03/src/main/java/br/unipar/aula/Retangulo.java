package br.unipar.aula;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andersonbosing
 */
public class Retangulo {
    
    private Integer comprimento;
    private Integer largura; 
    private Integer area;
    private Integer perimetro;
    
    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }
    
    public void setLargura(Integer largura) {
        this.largura = largura;
    }
    
    public Integer getComprimento() {
        return this.comprimento;
    }
    
    public Integer getLargura() {
        return this.largura;
    }
    
    public void calcularArea() {
        this.area = this.largura * this.comprimento;
    }
    
    public void calcularPerimetro() {
        this.perimetro = (2 * this.comprimento) + (2 * this.largura);
    }
    
    public void imprimir() {
        System.out.println(
                "Comprimento = " + this.comprimento +
                "Largura = " + this.largura +
                "Area = "+ this.area +
                "Perimetro = " + this.perimetro
        );
    }
    
}
