package com.anabneri.microsservices.productcatalog.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swagConfig(){
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors.basePackage("com.gl"))
            .build()
            .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("Order management application",
            "Documentation for Order management application",
            "1.0",
            "Terms of service for using Order management application",
            new Contact("Ana Neri","","teste@teste.com"),
            "MIT Licence",
            "https://opensource.org/licenses/MIT",
            new ArrayList<>()
        );
    }
}

