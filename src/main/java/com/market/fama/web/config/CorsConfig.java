package com.market.fama.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Permite solicitudes desde http://localhost:8080
        config.addAllowedOrigin("http://localhost:8080");

        // Permite solicitudes con los siguientes métodos
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");

        // Permite solicitudes con los siguientes encabezados
        config.addAllowedHeader("Content-Type");
        config.addAllowedHeader("Authorization");

        // Puedes ajustar otras configuraciones según tus necesidades

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}