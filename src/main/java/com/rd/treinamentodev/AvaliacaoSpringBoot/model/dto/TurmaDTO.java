package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TurmaDTO {

    private CursoDTO curso;

    private String dtInicio;

    private String dtFim;

    private List<InstrutorDTO> instrutores;

    private List<AlunoDTO> alunos;
}
