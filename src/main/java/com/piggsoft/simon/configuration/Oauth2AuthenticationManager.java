/*
package com.piggsoft.simon.configuration;

import org.springframework.boot.autoconfigure.security.AuthenticationManagerConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;

*/
/**
 * Created by piggs on 2017/4/13.
 * 覆盖 AuthenticationManagerConfiguration
 *//*

@Configuration
public class Oauth2AuthenticationManager {

    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Order(Ordered.LOWEST_PRECEDENCE - 100)
    private static class Oauth2AuthenticationConfigurerAdapter
            extends GlobalAuthenticationConfigurerAdapter {
        private final SecurityProperties securityProperties;

        Oauth2AuthenticationConfigurerAdapter(SecurityProperties securityProperties) {
            this.securityProperties = securityProperties;
        }

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            auth.apply();
        }
    }

    public static class DefaultUserDetailsManagerConfigurer extends UserDetailsManagerConfigurer<AuthenticationManagerBuilder, > {

    }

}
*/
