/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.polimorfismo;

import br.unipar.polimorfismo.model.Animal;
import br.unipar.polimorfismo.model.Cachorro;
import br.unipar.polimorfismo.model.Peixe;
import br.unipar.polimorfismo.model.Respirador;

/**
 *
 * @author andersonbosing
 */
public class Polimorfismo2026 {

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        cachorro.setId(1);
        cachorro.setNome("Hunter");
        cachorro.setPeso(9.0);
        cachorro.setPelagem("Curto");
        
        Peixe peixe = new Peixe();
        peixe.setId(2);
        peixe.setNome("Nemo");
        peixe.setPeso(1.0);
        peixe.setTipoDeAgua("Salgada");
        
        Animal animal = new Animal();
        animal.setId(3);
        animal.setNome("Animalzinho");
        animal.setPeso(10.0);
        
        Respirador respirador = new Respirador();
        respirador.executarRespiracao(cachorro);
        respirador.executarRespiracao(peixe);
        respirador.executarRespiracao(animal);
        
        
    }
}
