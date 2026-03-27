/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.agenda.contatos.model;

/**
 *
 * @author andersonbosing
 */
public class Cidade {
    
    private Integer id;
    
    private String nome;
    
    private String cdIbge;
    
    private Estado estado;

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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", nome=" + nome + ", cdIbge=" + cdIbge + ", estado=" + estado + '}';
    }
    
}
