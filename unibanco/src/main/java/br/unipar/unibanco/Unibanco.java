/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.unibanco;

import br.unipar.unibanco.models.Agencia;
import br.unipar.unibanco.models.Correntista;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Unibanco {

    public static void main(String[] args) {
        
        ArrayList<String> minhaListaNomes = new ArrayList<>();
        minhaListaNomes.add("Anderson");
        minhaListaNomes.add("Fernando");
        minhaListaNomes.add("Levi");
        minhaListaNomes.add("Pedro");
        
        minhaListaNomes.remove("Fernando");
        minhaListaNomes.clear();
        
        JOptionPane.showMessageDialog(null, minhaListaNomes.toString());
    
    
        Correntista correntista = new Correntista();
        correntista.setId(1);
        correntista.setNome("Anderson");
        
        
        Correntista correntista2 = new Correntista();
        correntista2.setId(2);
        correntista2.setNome("Anderson2");
        
        
        Correntista correntista3 = new Correntista();
        correntista3.setId(3);
        correntista3.setNome("Anderson3");
        
        Agencia agencia = new Agencia();
        agencia.setId(1);
        agencia.setNome("Nubank");
        
        agencia.addCorrentista(correntista);
        agencia.addCorrentista(correntista2);
        agencia.addCorrentista(correntista3);
    
    
        JOptionPane.showMessageDialog(null, agencia.toString());
    }
}
