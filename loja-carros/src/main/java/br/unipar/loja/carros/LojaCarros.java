/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.loja.carros;

import br.unipar.loja.carros.model.Carro;
import br.unipar.loja.carros.model.Marca;
import br.unipar.loja.carros.model.Modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class LojaCarros {

    public static void main(String[] args) {
        
        Marca marca = new Marca();
        marca.setCnpj("1312312312312312");
        marca.setId(1);
        marca.setNomeFantasia("BMW");
        marca.setRazaoSocial("alalalalala");
        
        Modelo modelo = new Modelo();
        modelo.setId(1);
        modelo.setNome("M3");
        modelo.setVelocidadeMaxima(220.0);
        
        Carro carro = new Carro();
        carro.setAno(2025);
        carro.setCor("Cinza");
        carro.setId(1);
        carro.setNrChassi("y1298763876218931298636");
        carro.setMarca(marca);
        carro.setModelo(modelo);
        
        JOptionPane.showMessageDialog(null, carro.toString());
        
    }
}
