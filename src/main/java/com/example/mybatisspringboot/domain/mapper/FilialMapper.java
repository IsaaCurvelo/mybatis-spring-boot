package com.example.mybatisspringboot.domain.mapper;

import com.example.mybatisspringboot.domain.model.Filial;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FilialMapper {

    void inserir(Filial filial);

    void atualizar(Filial filial);

    Filial porId(Long id);

    List<Filial> listar();

}
