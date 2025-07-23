package com.br.gpe.infraestructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "aluno")
@Entity


public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @Column(name = "nome")
    private String nome;

}
