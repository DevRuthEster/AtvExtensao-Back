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
public abstract class Pessoa {
    
    private int cod, cpf,rg,telefone;
    private LocalDate dataDeNascimento;
    private String nome, endereco;
    private char sexo;

    public Pessoa(int cod, int cpf, int reg, int telefone, LocalDate dataDeNascimento, String nome, String endereco, char sexo) {
        this.cod = cod;
        this.cpf = cpf;
        this.rg = reg;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getReg() {
        return rg;
    }

    public void setReg(int reg) {
        this.rg = reg;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
