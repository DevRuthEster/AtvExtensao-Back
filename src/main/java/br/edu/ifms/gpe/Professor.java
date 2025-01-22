/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.gpe;

import java.time.LocalDate;

/**
 *
 * @author ruthg
 */
public class Professor extends Pessoa{
    private String formacao;

    public Professor(int cod, int cpf, int reg, int telefone, LocalDate dataDeNascimento, String nome, String endereco, char sexo) {
        super(cod, cpf, reg, telefone, dataDeNascimento, nome, endereco, sexo);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
}
