/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.pet.dogui;

import br.unipar.pet.dogui.domains.Especie;
import br.unipar.pet.dogui.enums.StatusEnum;
import br.unipar.pet.dogui.exceptions.ValidacaoNegocioException;
import br.unipar.pet.dogui.infraestructure.ConnectionFactory;
import br.unipar.pet.dogui.repositories.EspecieRepository;
import br.unipar.pet.dogui.repositories.interfaces.EspecieRepositoryInterface;
import br.unipar.pet.dogui.services.EspecieService;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author andersonbosing
 */
public class Main {

    public static void main(String[] args) {
     
        try {
            Especie especie1 = new Especie();
            especie1.setStatus(StatusEnum.ATIVO);
            especie1.setDeletado(Boolean.FALSE);
            especie1.setNome("Ave");
            especie1.setDtCriacao(new Date());
            especie1.setDtAtualizacao(new Date());
            
            EspecieService especieService = new EspecieService();
            especieService.inserir(especie1);

        } catch(Exception exception) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao executar o sistema:"+
                    exception.getMessage());
        }finally {
            JOptionPane.showMessageDialog(null, "Sempre é executado, independente de "
            + "ter dado exception");
        }
        
        
        JOptionPane.showMessageDialog(null, "Sistema continuou executando");
        
    }
}
