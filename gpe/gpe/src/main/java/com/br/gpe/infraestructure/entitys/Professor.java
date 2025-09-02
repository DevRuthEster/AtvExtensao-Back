/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.br.gpe.infraestructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "professor")
@Entity


public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "rg", unique = true, nullable = false)
    private String rg;
    
    @Column(name = "dataNascimento")
    private LocalDate dataNascimento;
    
    @Column(name = "genero")
    private String genero;
    
    @Column(name = "endereco")
    private String endereco;
    
    @Column (name = "telefone",nullable = false)
    private String telefone;
    
    

}