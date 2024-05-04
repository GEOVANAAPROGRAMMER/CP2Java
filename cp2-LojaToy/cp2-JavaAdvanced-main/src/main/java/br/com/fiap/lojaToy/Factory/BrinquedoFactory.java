package br.com.fiap.lojaToy.Factory;

import br.com.fiap.lojaToy.DTO.BrinquedoDTO;
import br.com.fiap.lojaToy.Models.Brinquedo;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BrinquedoFactory {
    public List<BrinquedoDTO> toDto(List<Brinquedo> brinquedos){
        return Optional.ofNullable(brinquedos).map(lista -> lista.stream().map(this::toDto).collect(Collectors.toList())).orElse(Collections.emptyList());
    }

    public BrinquedoDTO toDto(Brinquedo brinquedo){
        BrinquedoDTO dto = new BrinquedoDTO();

        dto.setId(brinquedo.getId());
        dto.setNome(brinquedo.getNome());
        dto.setPreco(brinquedo.getPreco());
        dto.setTamanho(brinquedo.getTamanho());

        return dto;
    }

    public List<Brinquedo> toEntity(List<BrinquedoDTO> brinquedos) {
        return Optional.ofNullable(brinquedos)
                .map(lista -> lista.stream().map(this::toEntity).collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    public Brinquedo toEntity(BrinquedoDTO brinquedo){

        Brinquedo entity = new Brinquedo();

        entity.setId(brinquedo.getId());
        entity.setNome(brinquedo.getNome());
        entity.setPreco(brinquedo.getPreco());
        entity.setTamanho(brinquedo.getTamanho());

        return entity;
    }
}
