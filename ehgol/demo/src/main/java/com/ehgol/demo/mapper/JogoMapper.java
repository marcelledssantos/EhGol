package com.ehgol.demo.mapper;

import com.ehgol.demo.dto.JogoCreateDto;
import com.ehgol.demo.dto.JogoResponseDto;
import com.ehgol.demo.entities.Jogo;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JogoMapper {

    public static Jogo toJogo(JogoCreateDto dto) {
        return new ModelMapper().map(dto, Jogo.class);
    }

    public static JogoResponseDto toDto(Jogo jogo) {
        return new ModelMapper().map(jogo, JogoResponseDto.class);
    }
}

