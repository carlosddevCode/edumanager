package com.edumanager.edumanager.repository;

import com.edumanager.edumanager.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
