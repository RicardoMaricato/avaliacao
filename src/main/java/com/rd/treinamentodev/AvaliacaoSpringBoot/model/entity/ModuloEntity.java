package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "tb_modulo")
@Data
public class ModuloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modulo")
    private BigInteger idModulo;

    @Column(name = "ds_nome")
    private String dsNome;

    @OneToOne
    @JoinColumn(name = "id_modulo")
    private InstrutorEntity instrutor;
}
