package com.edumanager.edumanager.controller;

import com.edumanager.edumanager.model.Matricula;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.edumanager.edumanager.service.MatriculaService;

import java.util.List;

@RestController
@RequestMapping("/Matriculas")
public class MatriculaController {

    private MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @GetMapping
    public List<Matricula> ListarTodos() {
        return matriculaService.ListarTodos();
    }

    @PostMapping
    public Matricula salvar(@RequestBody Matricula matricula) {
        return matriculaService.salvar(matricula);
    }
    @GetMapping("{id}")
    public ResponseEntity<Matricula> BuscarPorId(@PathVariable Long id) {
        return (ResponseEntity<Matricula>) matriculaService.BuscarPorId(id).<ResponseEntity<?>>map(ResponseEntity::ok).orElse(ResponseEntity.status(404).body("Matricula com ID " + id + " não encontrado."));
    }
    @DeleteMapping("/{id}")
    public void Deletar(@PathVariable Long id){
        matriculaService.Deletar(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Matricula> Atualizar(@PathVariable Long id, @RequestBody Matricula dados){

        Matricula matriculaAtualizada = matriculaService.atualizar(id, dados);
        if (matriculaAtualizada == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(matriculaAtualizada);
    }
}

