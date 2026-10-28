package com.edumanager.edumanager.service;

import com.edumanager.edumanager.model.Aluno;
import com.edumanager.edumanager.model.Disciplina;
import com.edumanager.edumanager.model.Matricula;
import com.edumanager.edumanager.repository.AlunoRepository;
import com.edumanager.edumanager.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;
import com.edumanager.edumanager.repository.MatriculaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService {

    private final MatriculaRepository matriculaRepository;
    private final DisciplinaRepository disciplinaRepository;
    private final AlunoRepository alunoRepository;

    public MatriculaService(MatriculaRepository matriculaRepository, DisciplinaRepository disciplinaRepository, AlunoRepository alunoRepository) {
        this.matriculaRepository = matriculaRepository;
        this.disciplinaRepository = disciplinaRepository;
        this.alunoRepository = alunoRepository;
    }
    public List<Matricula> ListarTodos(){
        return matriculaRepository.findAll();
    }
    public Matricula salvar(Matricula matricula){
        if(matricula.getAluno() == null || matricula.getAluno().getId() == null){
           throw new IllegalArgumentException("ID do aluno é obrigatorio!");
        }
        if(matricula.getDisciplina() == null || matricula.getDisciplina().getId() == null){
    throw new IllegalArgumentException("O ID da diciplina é obrigatorio!");
        }
        Aluno aluno = alunoRepository.findById(matricula.getAluno().getId()).orElseThrow(() ->new IllegalArgumentException("Aluno não encontrado no banco de dados!"));


        Disciplina disciplina = disciplinaRepository.findById(matricula.getDisciplina().getId()).orElseThrow(() ->new IllegalArgumentException("Discliplina não encontrado no banco de dados!"));

        matricula.setAluno(aluno);
        matricula.setDisciplina(disciplina);

        return matriculaRepository.save(matricula);
    }
    public Optional<Matricula>BuscarPorId(Long id){
        return matriculaRepository.findById(id);
    }
    public void Deletar(Long id){
        matriculaRepository.deleteById(id);
    }
    public Matricula atualizar(Long id, Matricula dados) {
        return matriculaRepository.findById(id).map(matricula -> {
            matricula.setDataMatricula(dados.getDataMatricula());
            matricula.setStatus(dados.getStatus());
            matricula.setAluno(dados.getAluno());
            matricula.setDisciplina(dados.getDisciplina());
            return matriculaRepository.save(matricula);
        }).orElse(null);
    }
}
