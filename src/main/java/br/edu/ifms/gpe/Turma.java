/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.gpe;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ruthg
 */
public class Turma {

    private int codigo;
    private Modalidade modalidade;
    private List<Aluno> alunos;
    private Professor professor;
    private LocalDate dataAbertura;
    private DiasDaSemana diasDaSemana;
    private Niveis niveis;
    private Date dataInicio;
    private Date dataConclusao;

    public Turma(int codigo, Modalidade modalidade, List<Aluno> alunos, Professor professor, LocalDate dataAbertura, DiasDaSemana diasDaSemana, Niveis niveis, Date dataInicio, Date dataConclusao) {
        this.codigo = codigo;
        this.modalidade = modalidade;
        this.alunos = alunos;
        this.professor = professor;
        this.dataAbertura = dataAbertura;
        this.diasDaSemana = diasDaSemana;
        this.niveis = niveis;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public DiasDaSemana getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(DiasDaSemana diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    public Niveis getNiveis() {
        return niveis;
    }

    public void setNiveis(Niveis niveis) {
        this.niveis = niveis;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public void matricularAlunos(List<Aluno> alunos) {

    }

}
