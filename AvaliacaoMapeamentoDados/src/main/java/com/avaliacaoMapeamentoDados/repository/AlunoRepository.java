package com.avaliacaoMapeamentoDados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacaoMapeamentoDados.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
