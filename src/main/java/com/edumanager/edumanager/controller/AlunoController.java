package com.edumanager.edumanager.controller;

import com.edumanager.edumanager.model.Aluno;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.edumanager.edumanager.service.AlunoService;

import java.util.List;

@RestController
@RequestMapping("/Alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
    @GetMapping
    public List<Aluno> ListarTodos(){
        return alunoService.ListarTodos();
    }
    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno){
        return alunoService.salvar(aluno);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Aluno>BuscarPorId(@PathVariable Long id){
        return (ResponseEntity<Aluno>) alunoService.BuscarPorId(id).<ResponseEntity<?>>map(ResponseEntity::ok).orElse(ResponseEntity.status(404).body("Aluno com ID "+ id + " não encontrado."));
    }

    @DeleteMapping("/{id}")
    public void Deletar(@PathVariable Long id){
        alunoService.Deletar(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> Atualizar(@PathVariable Long id, @RequestBody Aluno dados){

        Aluno alunoAtualizado = alunoService.atualizar(id, dados);
         if (alunoAtualizado == null){
             return ResponseEntity.notFound().build();
         }
         return ResponseEntity.ok(alunoAtualizado);
    }
}
