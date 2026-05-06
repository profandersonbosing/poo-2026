/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.pet.dogui.repositories.interfaces;

import br.unipar.pet.dogui.domains.Especie;
import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */
public interface EspecieRepositoryInterface {
    
    public Especie inserir(Especie especie);
    
    public Especie atualizar(Especie especie);
    
    public void deletar(Long id);
    
    public Especie findById(Long id);
    
    public ArrayList<Especie> listarTodos();
    
}
