package com.example.restfullwebservices;

// Configuration


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig{
    // Bean - Docket

    @Bean
    public Docket api() {
        return new Docket( DocumentationType.SWAGGER_2 ).apiInfo( ApiInfo.DEFAULT );
    }
    // Swagger 2
    // All the path  & APIs


}
