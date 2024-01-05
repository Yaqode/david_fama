package com.market.fama.web.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class JWTUtil {
    private static String SECRET_KEY = "f3rr3-f4m4";
    private static Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);

    public String create(String user) {
        return JWT.create()
                .withSubject(user)
                .withIssuer("ferre-fama")
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1)))
                .sign(algorithm);
    }

    public boolean isValid(String jwt) {
        try {
            JWT.require(algorithm)
                    .build()
                    .verify(jwt);
            return true;
        } catch (JWTVerificationException e) {
            return false;
        }

    }

    public String getUsername(String jwt) {
        return JWT.require(algorithm)
                .build()
                .verify(jwt)
                .getSubject();
    }
}
