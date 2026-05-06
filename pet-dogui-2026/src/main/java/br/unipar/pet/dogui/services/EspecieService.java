/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.services;

import br.unipar.pet.dogui.domains.Especie;
import br.unipar.pet.dogui.exceptions.ValidacaoNegocioException;
import br.unipar.pet.dogui.repositories.EspecieRepository;
import br.unipar.pet.dogui.repositories.interfaces.EspecieRepositoryInterface;

/**
 *
 * @author andersonbosing
 */
public class EspecieService {
    
    private EspecieRepositoryInterface especieRepositoryInterface;
    
    public EspecieService() {
        this.especieRepositoryInterface = new EspecieRepository();
    }
    
    public Especie inserir(Especie especie) throws ValidacaoNegocioException {
        
        if (especie == null) {
            throw new ValidacaoNegocioException("Obrigatório informar a Especie para inserção");
        }
        
        if (especie.getNome().isBlank()) {
            throw new ValidacaoNegocioException("Informe o Nome da Especie");
        }
        
        if (especie.getNome().isEmpty()) {
            throw new ValidacaoNegocioException("Informe o Nome da Especie");
        }
        
        if (especie.getNome().length() < 2) {
            throw new ValidacaoNegocioException("O nome da Especie precisa conter dois ou "
                    + "mais caracteres");
        }
        
        if (especie.getNome().length() > 60) {
            throw new ValidacaoNegocioException("O nome da especie deve conter menos que "
                    + "60 caracteres");
        }
        
        especie = especieRepositoryInterface.inserir(especie);
        
        return especie;
    }
    
    //atualizar
    //deletar
    //findById
    //listarTodos
    
}
