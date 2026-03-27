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
public class Agenda {
    
    private Integer id;
    
    private String descricao;
    
    private ArrayList<Contato> listaContatos = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(ArrayList<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }

    @Override
    public String toString() {
        return "Agenda{" + "id=" + id + ", descricao=" + descricao + ", listaContatos=" + listaContatos + '}';
    }
    
}
