package com.br.gpe.infraestructure.repository;


import com.br.gpe.infraestructure.entitys.Aluno;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {

  Optional<Aluno> findByCpf(String cpf);

  @Transactional
  void deleteByCpf(String cpf);
}
