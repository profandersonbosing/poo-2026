/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.agenda.contatos.model;

/**
 *
 * @author andersonbosing
 */
public class Estado {
    
    private Integer id;
    
    private String nome;
    
    private String cdIbge;
    
    private Pais pais;

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

    public String getCdIbge() {
        return cdIbge;
    }

    public void setCdIbge(String cdIbge) {
        this.cdIbge = cdIbge;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", nome=" + nome + ", cdIbge=" + cdIbge + ", pais=" + pais + '}';
    }
    
}
