package com.edumanager.edumanager.controller;

import com.edumanager.edumanager.model.Disciplina;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.edumanager.edumanager.service.DisciplinaService;

import java.util.List;

@RestController
@RequestMapping("/Disciplinas")
public class DisciplinaController {

    private DisciplinaService disciplinaService;

    public DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }
    @GetMapping
    public List<Disciplina> ListarTodos(){
        return disciplinaService.ListarTodos();
    }
    @PostMapping
    public Disciplina salvar(@RequestBody Disciplina disciplina){
        return disciplinaService.salvar(disciplina);
    }
    @GetMapping("{id}")
    public ResponseEntity<Disciplina> BuscarPorId(@PathVariable Long id){
        return (ResponseEntity<Disciplina>) disciplinaService.BuscarPorId(id).<ResponseEntity<?>>map(ResponseEntity::ok).orElse(ResponseEntity.status(404).body("Disciplina com ID "+ id + " não encontrado."));
    }
    @DeleteMapping("{id}")
    public void Deletar(@PathVariable Long id){
        disciplinaService.Deletar(id);
    }
    @PostMapping("{id}")
    public ResponseEntity<Disciplina> Atualizar(@PathVariable Long id, @RequestBody Disciplina dados){

        Disciplina disciplinaAtualizada = disciplinaService.atualizar(id, dados);
        if (disciplinaAtualizada == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(disciplinaAtualizada);
    }
}


