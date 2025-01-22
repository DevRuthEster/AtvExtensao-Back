/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.gpe;

/**
 *
 * @author ruthg
 */
public class Diario {

    private Turma turma;
    private DiasDaSemana dias;
    

    public Diario(Turma turma, DiasDaSemana dias) {
        this.turma = turma;
        this.dias = dias;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public DiasDaSemana getDias() {
        return dias;
    }

    public void setDias(DiasDaSemana dias) {
        this.dias = dias;
    }
      public Turma gerarRelatorioGeral(){
          return turma;
      }
      
          public Frequencia gerarRelatorioFalta(Frequencia frequencia){
          return frequencia;
      }
}
