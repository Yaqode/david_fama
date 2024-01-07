package com.market.fama.web.controller;

import com.market.fama.domain.Direction;
import com.market.fama.domain.Person;
import com.market.fama.domain.Profile;
import com.market.fama.domain.User;
import com.market.fama.domain.dto.AuthDto;
import com.market.fama.web.config.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JWTUtil jwtUtil;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, JWTUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login (@RequestBody AuthDto loginDto) {
        UsernamePasswordAuthenticationToken login = new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword());
        Authentication authentication = this.authenticationManager.authenticate(login);

        System.out.println(authentication.isAuthenticated());
        System.out.println(authentication.getPrincipal());

        String jwt = jwtUtil.create(loginDto.getUsername());


        System.out.println(authentication);

        String[] email = loginDto.getUsername().split(",");
        String[] id = loginDto.getUsername().split("/");
        String[] perfil = loginDto.getUsername().split("-");

        System.out.println(email[0]);
        System.out.println(id[0]);
        System.out.println(perfil[0]);

        Response response = new Response("Bienvenido", jwt, email[0], id[0], perfil[0]);

        return ResponseEntity.ok()
                .header(HttpHeaders.AUTHORIZATION, jwt)
                .body(response);
        //return ResponseEntity.ok().header(HttpHeaders.AUTHORIZATION, jwt).build();
    }

    public static class Response {
        private String message;
        private String jwt;

        private String email;
        private String id;
        private String perfil;

        public Response(String message, String jwt, String email, String id, String perfil) {
            this.message = message;
            this.jwt = jwt;
            this.email = email;
            this.id = id;
            this.perfil = perfil;
        }

        // Getters y setters (puedes generarlos automáticamente según tu IDE)

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getJwt() {
            return jwt;
        }

        public void setJwt(String jwt) {
            this.jwt = jwt;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPerfil() {
            return perfil;
        }

        public void setPerfil(String perfil) {
            this.perfil = perfil;
        }
    }
}
