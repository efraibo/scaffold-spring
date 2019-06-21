package com.sourceinformation.scaffold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ScaffoldSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldSpringApplication.class, args);
    }

    //Configurando cors
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("*")
                        .allowedOrigins("*")
                ;
            }
        };
    }
    @Bean
    CorsConfigurationSource configurationSource() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedOrigin("*");
//		corsConfiguration.addExposedHeader("");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        return source;
    }

}
