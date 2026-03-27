/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.agenda.contatos;

import br.unipar.agenda.contatos.model.Agenda;
import br.unipar.agenda.contatos.model.Calculadora;
import br.unipar.agenda.contatos.model.Cidade;
import br.unipar.agenda.contatos.model.Contato;
import br.unipar.agenda.contatos.model.Endereco;
import br.unipar.agenda.contatos.model.Estado;
import br.unipar.agenda.contatos.model.Pais;
import br.unipar.agenda.contatos.model.Telefone;

/**
 *
 * @author andersonbosing
 */
public class AgendaContatos2026 {

    public static void main(String[] args) {
//        vamos criar uma agenda de contatos com endereço e 
//                telefones para cada contato.

        Pais pais = new Pais();
        pais.setId(1);
        pais.setNome("Brasil");
        
        Pais pais2 = new Pais(2, "Paraguay");
        
        Estado estado = new Estado();
        estado.setId(1);
        estado.setNome("PR");
        estado.setCdIbge("21312312");
        estado.setPais(pais);
        
        Cidade cidade = new Cidade();
        cidade.setId(1);
        cidade.setNome("Toledo");
        cidade.setCdIbge("534667785");
        cidade.setEstado(estado);
        
        Endereco endereco = new Endereco();
        endereco.setBairro("La Salle");
        endereco.setCep("85920-000");
        endereco.setId(1);
        endereco.setNmRua("Avenida Parigot de souza");
        endereco.setNumero(2);
        endereco.setObservacao("Rua sem saida");
        endereco.setCidade(cidade);
        
        Telefone telefone = new Telefone();
        telefone.setId(1);
        telefone.setDdd("45");
        telefone.setNumero("87987987879978");
        
        Telefone telefoneCasa = new Telefone();
        telefoneCasa.setDdd("45");
        telefoneCasa.setId(2);
        telefoneCasa.setNumero("32778899");
        
        Contato contato = new Contato();
        contato.setId(1);
        contato.setNome("Anderson");
        contato.addEndereco(endereco);
        contato.addTelefone(telefone);
        contato.addTelefone(telefoneCasa);
        
        Agenda agenda = new Agenda();
        agenda.setDescricao("Agenda do Anderson");
        agenda.setId(1);
        agenda.getListaContatos().add(contato);
        
        System.out.println(agenda.toString());
        
        
    }
}
