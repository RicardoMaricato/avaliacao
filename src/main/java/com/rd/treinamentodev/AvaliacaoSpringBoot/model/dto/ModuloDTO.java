package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModuloDTO {

    private BigInteger idModulo;

    private String dsNome;

    private BigInteger idInstrutor;
}
