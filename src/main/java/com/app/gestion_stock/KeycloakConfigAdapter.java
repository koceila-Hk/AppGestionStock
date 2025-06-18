package com.app.gestion_stock;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfigAdapter {

    @Bean
    public KeycloakSpringBootConfigResolver springBoogConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }

}
