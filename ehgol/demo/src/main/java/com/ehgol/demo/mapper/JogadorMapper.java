package com.ehgol.demo.mapper;

import com.ehgol.demo.dto.JogadorCreateDto;
import com.ehgol.demo.dto.JogadorResponseDto;
import com.ehgol.demo.entities.Jogador;
import lombok.AccessLevel;
import org.modelmapper.ModelMapper;
import lombok.NoArgsConstructor;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class JogadorMapper {
        public static Jogador toJogador(JogadorCreateDto dto) {
            return new ModelMapper().map(dto, Jogador.class);
        }
        public static JogadorResponseDto toDto(Jogador jogador) {
            return new ModelMapper().map(jogador, JogadorResponseDto.class);
        }
}
