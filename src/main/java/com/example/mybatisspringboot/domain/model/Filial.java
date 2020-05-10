package com.example.mybatisspringboot.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class Filial {

    private Long id;
    private String nome;
    private List<Estoque> estoques;

}
