package com.edumanager.edumanager.service;

import com.edumanager.edumanager.model.Aluno;
import org.springframework.stereotype.Service;
import com.edumanager.edumanager.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
    public List<Aluno> ListarTodos(){
        return alunoRepository.findAll();
    }
    public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }
    public Optional<Aluno> BuscarPorId(Long id){
        return alunoRepository.findById(id);
    }
    public void Deletar(Long id){
        alunoRepository.deleteById(id);
    }
    public Aluno atualizar(Long id, Aluno dados) {
        return alunoRepository.findById(id).map(aluno -> {
            aluno.setNome(dados.getNome());
            aluno.setCpf(dados.getCpf());
            aluno.setEmail(dados.getEmail());
            return alunoRepository.save(aluno);
        }).orElse(null);
    }
    }
