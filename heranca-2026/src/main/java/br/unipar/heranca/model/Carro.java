/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class Carro extends Veiculo {
    
    private Integer qtdRodas;

    public Carro(Integer id, String nrChassi, String cor, String rg) {
        super(id, nrChassi, cor);
        super.setRg(rg);
        this.qtdRodas = 1;
    }

    public Integer getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(Integer qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    @Override
    public String toString() {
        return "Carro{" + "qtdRodas=" + qtdRodas + '}';
    }
    
    
}
