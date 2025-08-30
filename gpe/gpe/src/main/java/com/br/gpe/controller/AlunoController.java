package com.br.gpe.controller;

import com.br.gpe.business.AlunoService;
import com.br.gpe.infraestructure.entitys.Aluno;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor

public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Void> salvarAluno(@RequestBody Aluno aluno){
        alunoService.salvarAluno(aluno);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{cpf}")
    public ResponseEntity <Aluno> buscarAlunoPorCpf(@PathVariable String cpf){
        return ResponseEntity.ok(alunoService.buscarAlunoPorCpf(cpf));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarAlunoPorCpf(@RequestParam String cpf){
       alunoService.deletarAlunoPorCpf(cpf);
        return ResponseEntity.ok().build();
    }

    @PutMapping
public ResponseEntity<Void> atualizarAlunoPorId(@RequestParam Long id ,@RequestBody Aluno aluno){
        alunoService.atualizarAlunoPorId(id,aluno);
        return ResponseEntity.ok().build();
    }

}
