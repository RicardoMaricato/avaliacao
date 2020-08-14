package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import com.rd.treinamentodev.AvaliacaoSpringBoot.service.bo.CursoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CursoService {

    @Autowired
    private CursoRepository repository;

    @Autowired
    private CursoBO cursoBO;

    public List<CursoDTO> buscarTodos() {
        List<CursoEntity> listEntity = repository.findAll();
        List<CursoDTO> listDTO = new ArrayList<>();

        for (CursoEntity entity : listEntity) {
            CursoDTO dto = cursoBO.parseToDTO(entity);
            listDTO.add(dto);

        }
        return listDTO;
    }

    public void cadastrar(CursoDTO dto) {
        CursoEntity entity = cursoBO.parseToEntity(dto, null);
        if (entity.getNomeCurso() != null)
            repository.save(entity);
    }

}
