/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.pet.dogui.services;

import br.unipar.pet.dogui.domains.Especie;
import br.unipar.pet.dogui.exceptions.NaoEncontradoException;
import br.unipar.pet.dogui.exceptions.ValidacaoNegocioException;
import br.unipar.pet.dogui.repositories.EspecieRepository;
import br.unipar.pet.dogui.repositories.interfaces.EspecieRepositoryInterface;
import java.util.ArrayList;

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
    
    public Especie atualizar(Especie especie) throws ValidacaoNegocioException, NaoEncontradoException {

        if (especie == null) {
            throw new ValidacaoNegocioException("Obrigatório informar a Especie para atualização");
        }
        
        if (especie.getId() == null) {
            throw new ValidacaoNegocioException("Obrigatório informar o ID da Especie para atualização");
        }
       
        Especie especieValidacao = especieRepositoryInterface.findById(especie.getId());

        if (especieValidacao == null) {
            throw new NaoEncontradoException("Especie não encontrada para o ID informado");
        }

        if (especie.getNome() == null || especie.getNome().isBlank()) {
            throw new ValidacaoNegocioException("Informe o Nome da Especie");
        }

        if (especie.getNome().length() < 2) {
            throw new ValidacaoNegocioException("O nome da Especie precisa conter dois ou mais caracteres");
        }

        if (especie.getNome().length() > 60) {
            throw new ValidacaoNegocioException("O nome da especie deve conter menos que 60 caracteres");
        }

        especie = especieRepositoryInterface.atualizar(especie);

        return especie;
    }

    public void deletar(Long id) throws ValidacaoNegocioException, NaoEncontradoException {

        if (id == null) {
            throw new ValidacaoNegocioException("Obrigatório informar o ID da Especie para exclusão");
        }
        
        Especie especieValidacao = especieRepositoryInterface.findById(id);

        if (especieValidacao == null) {
            throw new NaoEncontradoException("Especie não encontrada para o ID informado");
        }

        especieRepositoryInterface.deletar(id);
    }

    public Especie findById(Long id) throws ValidacaoNegocioException, NaoEncontradoException {

        if (id == null) {
            throw new ValidacaoNegocioException("Obrigatório informar o ID da Especie para busca");
        }

        Especie especie = especieRepositoryInterface.findById(id);

        if (especie == null) {
            throw new NaoEncontradoException("Especie não encontrada para o ID informado");
        }

        return especie;
    }

    public ArrayList<Especie> listarTodos() {
        return especieRepositoryInterface.listarTodos();
    }

}
