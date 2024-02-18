package com.ehgol.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("REST API - EhGol")
                                .description("Projeto desenvolvido para cadastro de gols e média de um jogador de futebol")
                                .version("v1")
                                .contact(new Contact().name("Marcelle Santos").email("marcelledossantos@gmail.com"))
                );
    }
}

