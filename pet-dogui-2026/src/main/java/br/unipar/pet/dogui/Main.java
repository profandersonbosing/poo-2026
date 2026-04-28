/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.pet.dogui;

import br.unipar.pet.dogui.domains.Especie;
import br.unipar.pet.dogui.enums.StatusEnum;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author andersonbosing
 */
public class Main {

    public static void main(String[] args) {
     
        Especie especie1 = new Especie();
        especie1.setStatus(StatusEnum.ATIVO);
        especie1.setDeletado(Boolean.FALSE);
        especie1.setNome("Cachorro");
        especie1.setDtCriacao(new Date());
        especie1.setDtAtualizacao(new Date());
     
        Especie especie2 = new Especie();
        especie2.setStatus(StatusEnum.ATIVO);
        especie2.setDeletado(Boolean.FALSE);
        especie2.setNome("Gato");
        especie2.setDtCriacao(new Date());
        especie2.setDtAtualizacao(new Date());
     
        ArrayList<Especie> listaEspecies = new ArrayList<>();
        listaEspecies.add(especie1);
        listaEspecies.add(especie2);
        
        for (Especie especie : listaEspecies) {
            System.out.println(especie.getNome());
        }
        
    }
}
