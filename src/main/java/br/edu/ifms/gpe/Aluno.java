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
public class  Aluno extends Pessoa{
    private String nomeResponsavel;
    private int contatoResponsavel;

    public Aluno(String nomeResponsavel, int contatoResponsavel, int cod, int cpf, int reg, int telefone, LocalDate dataDeNascimento, String nome, String endereco, char sexo) {
        super(cod, cpf, reg, telefone, dataDeNascimento, nome, endereco, sexo);
        this.nomeResponsavel = nomeResponsavel;
        this.contatoResponsavel = contatoResponsavel;
    }


    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getContatoResponsavel() {
        return contatoResponsavel;
    }

    public void setContatoResponsavel(int contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }
    
}
