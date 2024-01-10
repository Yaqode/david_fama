package com.market.fama.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig {

    private final JWTFilter jwtFilter;

    @Autowired
    public SecurityConfig(JWTFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    //Se deben crear las reglas para los roles, para efectos practicos se dejan para todos en requestMatchers
    //.requestMatchers(HttpMethod.GET, "/fama-market/api/*").permitAll()
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .cors().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeHttpRequests()
                .requestMatchers("/auth/login").permitAll()
                .requestMatchers("/brands/all").permitAll()
                .requestMatchers("/categories/all").permitAll()
                .requestMatchers("/families/all").permitAll()
                .requestMatchers("/persons/save").permitAll()
                .requestMatchers("/users/save").permitAll()
                .requestMatchers("/products/all").permitAll()
                .requestMatchers("/products/findByIdSubmarca/**").permitAll()
                .requestMatchers("/products/findByIdSubcategoria/**").permitAll()
                .requestMatchers("/products/findBySubmarcaIdMarca/**").permitAll()
                .requestMatchers("/products/findBySubcategoriaIdCategoria/**").permitAll()
                .requestMatchers("/products/findBySubcategoriaCategoriaIdFamilia/**").permitAll()
                .requestMatchers("/products/subbrands/**").permitAll()
                .requestMatchers("/products/subcategories/**").permitAll()
                .requestMatchers("/**").hasAnyRole("1","2")
                .anyRequest()
                .authenticated()
                .and()
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);;

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager (AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
}