package com.edumanager.edumanager.service;

import com.edumanager.edumanager.model.Aluno;
import com.edumanager.edumanager.model.Disciplina;
import org.springframework.stereotype.Service;
import com.edumanager.edumanager.repository.DisciplinaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;

    public DisciplinaService(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }
    public List<Disciplina> ListarTodos(){
        return disciplinaRepository.findAll();
    }
    public Disciplina salvar(Disciplina disciplina){
        return disciplinaRepository.save(disciplina);
    }
    public Optional<Disciplina>BuscarPorId(Long id){
        return disciplinaRepository.findById(id);
    }
    public void Deletar(Long id){
        disciplinaRepository.deleteById(id);
    }
    public Disciplina atualizar(Long id, Disciplina dados) {
        return disciplinaRepository.findById(id).map(disciplina -> {
            disciplina.setNome(dados.getNome());
            disciplina.setCargaHoraria(dados.getCargaHoraria());
            return disciplinaRepository.save(disciplina);
        }).orElse(null);
    }
}

