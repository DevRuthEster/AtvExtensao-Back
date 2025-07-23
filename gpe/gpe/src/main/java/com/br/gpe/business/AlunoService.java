package com.br.gpe.business;

import com.br.gpe.infraestructure.entitys.Aluno;
import com.br.gpe.infraestructure.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service

public class AlunoService {

    private final AlunoRepository repository;


    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public void salvarAluno(Aluno aluno){
        repository.saveAndFlush(aluno);
    }

    public Aluno buscarAlunoPorCpf(String cpf){
return repository.findByCpf(cpf).orElseThrow(
        () -> new RuntimeException("Cpf não encontrado.")
);
    }
public void deletarAlunoPorCpf(String cpf){
        repository.deleteByCpf(cpf);
}

public void atualizarAlunoPorId(Long id, Aluno aluno){
        Aluno alunoEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException(("Aluno não encontrado")));
        Aluno alunoAtualizado = Aluno.builder()
                .cpf(aluno.getCpf() != null ? aluno.getCpf() : alunoEntity.getCpf())
                .nome(aluno.getNome() != null ? aluno.getNome() : alunoEntity.getNome())
                .id(alunoEntity.getId())
                .build();

        repository.saveAndFlush(alunoAtualizado);
}

}
