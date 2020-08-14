package com.rd.treinamentodev.AvaliacaoSpringBoot.controller;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping
    public ResponseEntity<Object> buscarCursos() {
        return ResponseEntity.ok().body(service.buscarTodos());
    }

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody CursoDTO dto) {
        service.cadastrar(dto);
        return ResponseEntity.ok().body(dto);
    }
}
