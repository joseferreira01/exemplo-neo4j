/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.neo4j.entity;

import java.util.Objects;

/**
 *
 * @author jose2
 */
public class Pessoa {
    private String CPF;
    private String nome;
    private int idad;

    public Pessoa() {
    }

    public Pessoa(String CPF, String nome, int idad) {
        this.CPF = CPF;
        this.nome = nome;
        this.idad = idad;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdad() {
        return idad;
    }

    public void setIdad(int idad) {
        this.idad = idad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.CPF);
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + this.idad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.idad != other.idad) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "CPF=" + CPF + ", nome=" + nome + ", idad=" + idad + '}';
    }
    
    
}
