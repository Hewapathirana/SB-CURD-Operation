package edu.bit.sms.scheduler.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("edu.bit.sms.scheduler"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Schedular API",
                "booking scheduling and salon management",
                "API 1.0",
                "Terms of service",
                new Contact("Sathya MOlagoda", "www.sathyamolagoda.com", "ceo@sathyamolagoda.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", Collections.emptyList());
    }
}
