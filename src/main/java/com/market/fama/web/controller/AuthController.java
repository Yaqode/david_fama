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

        String[] email = authentication.getPrincipal().toString().split(",");
        String usernameParte = "";
        for (String email1 : email) {
            if (email1.contains("=")) {
                usernameParte = email1;
                break;
            }
        }

        String emailLimpio = "";
        String[] usernameSplit = usernameParte.split("=");
        if (usernameSplit.length == 2) {
            emailLimpio = usernameSplit[1].trim();
        }

        String[] id = authentication.getPrincipal().toString().split("/");
        String idParte = "";
        for (String email1 : id) {
            if (email1.contains(",")) {
                idParte = email1;
                break;
            }
        }

        String idLimpio = "";
        String[] idSplit = idParte.split(",");
        if (idSplit.length == 2) {
            idLimpio = idSplit[1].trim();
        }


        String[] perfil = authentication.getPrincipal().toString().split("-");
        String perfilParte = "";
        for (String email1 : perfil) {
            if (email1.contains("/")) {
                perfilParte = email1;
                break;
            }
        }

        String perfilimpio = "";
        String[] perfilSplit = perfilParte.split("/");
        if (perfilSplit.length == 2) {
            perfilimpio = perfilSplit[1].trim();
        }

        System.out.println(emailLimpio);
        System.out.println(idLimpio);
        System.out.println(perfilimpio);

        Response response = new Response("Bienvenido", jwt, emailLimpio, idLimpio, perfilimpio);

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
