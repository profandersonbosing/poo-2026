/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.agenda.contatos.model;

import java.util.ArrayList;

/**
 *
 * @author andersonbosing
 */
public class Contato {
    
    private Integer id;
    
    private String nome;
    
    private ArrayList<Telefone> listaTelefones = new ArrayList<>();
    
    private ArrayList<Endereco> listEndereco = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Telefone> getListaTelefones() {
        return listaTelefones;
    }

    public void setListaTelefones(ArrayList<Telefone> listaTelefones) {
        this.listaTelefones = listaTelefones;
    }

    public ArrayList<Endereco> getListEndereco() {
        return listEndereco;
    }

    public void setListEndereco(ArrayList<Endereco> listEndereco) {
        this.listEndereco = listEndereco;
    }
    
    public void addEndereco(Endereco endereco) {
        this.listEndereco.add(endereco);
    }
    
    public void addTelefone(Telefone telefone) {
        this.listaTelefones.add(telefone);
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome=" + nome + ", listaTelefones=" + listaTelefones + ", listEndereco=" + listEndereco + '}';
    }
    
}
